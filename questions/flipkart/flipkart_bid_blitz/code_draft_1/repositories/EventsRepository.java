package repositories;

import models.Bid;
import models.Event;
import models.User;
import models.exception.InvalidInput;

import java.time.LocalDate;
import java.util.*;

public class EventsRepository {

    UserRepository userRepository;
    int BID_LIMT = 5;
    HashMap<UUID, Event> eventDb;  // eid -> event

    HashMap<LocalDate, Event> calendar;
    HashMap<UUID, HashMap<UUID, HashSet<Bid>> > biddingsDb ; // eid -> [ uid -> bid]

    HashMap<UUID, Queue<Bid>> biddings; // eid, bid

    public EventsRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
        calendar = new HashMap<>();
        biddings = new HashMap<>();
        biddingsDb = new HashMap<>();
        eventDb = new HashMap<>();
    }

    public Event createEvent(LocalDate date, String prize){
        Event e = new Event(date, prize,"BBD");
        if(dateReserved(date)){
            throw new InvalidInput("Date is already reserved for another event");
        }
        eventDb.put(e.getId(), e);
        calendar.put(date, e);
        biddingsDb.put(e.getId(), new HashMap<>());
        biddings.put(e.getId(), new ArrayDeque<>());
        return e;
    }

    public void addParticipant(User u, UUID eventId){
        if(eventDb.containsKey(eventId)){
            Event e = eventDb.get(eventId);
            e.getParticipants().add(u.getId());
            biddingsDb.get(eventId).put(u.getId(), new HashSet<>());
        }
    }

    public void submitBidding(Bid b, UUID eventId){

        /// validate registered or not
        if(validatUserForBidding(b, eventId)){
            User u = b.getUser();
            checkEventActiveForBidding(eventId);
            updateUserCoins(b, eventId);
            biddingsDb.get(eventId).get(u.getId()).add(b);
            biddings.get(eventId).add(b);

        }
    }



    public Bid declareWinner(UUID eventId){
        Event e= eventDb.get(eventId);
        Queue<Bid> bids = biddings.get(eventId);
        Bid winner = null;
        while(bids.size()>0){
            Bid b = bids.remove();
            if (winner==null) winner = b;
            else winner = b.getAmt()< winner.getAmt() ? b: winner;
        }
        e.setWinner(winner);
        e.setActive(false);
        biddingsDb.remove(eventId);
        biddings.remove(eventId);
        System.out.println("Winner is being loaded, contest"+ e.getName()+" ended with id : "+e.getId()+" ");
        return winner;
    }


    private void updateUserCoins(Bid b , UUID e){
        User u = b.getUser();
        int maxBidAlreadyDone =0;
        if (biddingsDb.containsKey(e) && biddingsDb.get(e).containsKey(u.getId())){
            HashSet<Bid>doneBiddigs = biddingsDb.get(e).get(u.getId());
            for(Bid ele: doneBiddigs) maxBidAlreadyDone = Math.max(ele.getAmt(), maxBidAlreadyDone);
        }
        u.setCoins(u.getCoins()-b.getAmt()+maxBidAlreadyDone);
    }
    private boolean validatUserForBidding(Bid b, UUID eventId){
        User u = b.getUser();
        Event e = eventDb.get(eventId);
        if(!e.getParticipants().contains(b.getUser().getId())){
            // user not participated
            throw  new InvalidInput("User is not registered in event");
        }
        // check biddings
        HashMap<UUID, HashSet<Bid>> userBids = biddingsDb.get(eventId);
        if ( userBids!=null && userBids.get(b.getUser().getId()).size() >= BID_LIMT ){
            throw  new InvalidInput("No of bids exceeded ");
        }
        if(userBids.get(u.getId()).contains(b)){
            throw  new InvalidInput("Duplicate bids  not allowed");
        }
        if(u.getCoins()<b.getAmt()){
            // user have less coins
            throw  new InvalidInput("User don't have enough coins ");
        }

        return true;

    }
    private void checkEventActiveForBidding(UUID eventId){
        LocalDate now = LocalDate.now();
        Event e = eventDb.get(eventId);
        if(e.getDate().isBefore(now) || !e.isActive() ){
            throw new RuntimeException("Event is expired or not active anymore");
        }
    }

    public void showTop5Events(){
        eventDb.values().stream().
                sorted().
                limit(5L)
                .forEach(event->{
                    System.out.println("Event of date : "+event.getDate()+" won by: "+event.getWinner().getUser().getName()+" with a bid of : "+ event.getWinner().getAmt());
                });

    }


    private boolean dateReserved(LocalDate date){
        return calendar.containsKey(date);
    }

}

package services;

import models.Bid;
import models.Event;
import models.User;
import models.exception.InvalidInput;
import repositories.EventsRepository;
import repositories.UserRepository;

import java.time.LocalDate;
import java.util.UUID;

public class EventsService {

    EventsRepository eventsRepository;

    UserRepository userRepository;
    public EventsService(EventsRepository eventsRepository, UserRepository userRepository) {
        this.eventsRepository = eventsRepository;
        this.userRepository = userRepository;
    }

    public Event createEvent(LocalDate date, String prize){
        return eventsRepository.createEvent(date, prize);
    }

    public void addParticipant(User u, UUID eventId){
        eventsRepository.addParticipant(u, eventId);
    }

    public void submitBidding(UUID user, UUID eventId, int amt){

        /// validate registered or not
        User u = userRepository.getuser(user);
        Bid b = new Bid(u, amt);
        eventsRepository.submitBidding(b,  eventId);


    }
    public Bid declareWinner(UUID eventId){
        return eventsRepository.declareWinner(eventId);
    }

    public void top5Events(){
        eventsRepository.showTop5Events();
    }
}



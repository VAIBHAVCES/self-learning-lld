import models.Bid;
import models.Event;
import models.User;
import repositories.EventsRepository;
import repositories.UserRepository;
import services.EventsService;
import services.UserService;

import java.time.LocalDate;

import java.util.UUID;

public class main {

    public static void main(String[] args) {



        UserRepository userRepository = new UserRepository();
        EventsRepository eventsRepository = new EventsRepository(userRepository);
        EventsService eventsService = new EventsService(eventsRepository, userRepository);
        UserService userService = new UserService(userRepository);

        User u1 = userService.createUser ("Vaibhav", 1000);
        User u2 =  userService.createUser ("Shyam", 1000);
        User u3 =  userService.createUser ("Ram", 5000);
        Event e = eventsService.createEvent(LocalDate.of(2023,12,6), "Iphone");

        eventsService.addParticipant(u1, e.getId());
        eventsService.addParticipant(u2, e.getId());
        eventsService.addParticipant(u3, e.getId());

        eventsService.submitBidding(u1.getId(), e.getId(), 400);
        eventsService.submitBidding(u2.getId(), e.getId(), 100);

        eventsService.submitBidding(u3.getId(), e.getId(), 100);
        eventsService.submitBidding(u3.getId(), e.getId(), 200);
        eventsService.submitBidding(u3.getId(), e.getId(), 300);
        eventsService.submitBidding(u3.getId(), e.getId(), 400);
//        eventsService.submitBidding(u3.getId(), e.getId(), 20);
        eventsService.submitBidding(u3.getId(), e.getId(), 600);
//        eventsService.submitBidding(u3.getId(), e.getId(), 870);




//        eventsService.submitBidding(u3.getId(), e.getId(), 600);

        Bid winner = eventsService.declareWinner(e.getId());
        userService.showBalance();
        System.out.println("Winner is :"+ winner.getUser().getName()+" with bid of :"+ winner.getAmt());

//        Event e2 = eventsService.c

        eventsService.top5Events();



    }
}



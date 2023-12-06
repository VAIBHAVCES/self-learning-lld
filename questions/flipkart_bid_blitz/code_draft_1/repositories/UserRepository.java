package repositories;

import models.User;

import java.util.HashMap;
import java.util.UUID;

public class UserRepository {


    HashMap<UUID, User> userDb ;
    public UserRepository(){
        userDb = new HashMap<>();
    }
    public User createUser(String name, int coins) {
        User u = new User(name, coins);
        userDb.put(u.getId(),u);
        return u;
    }

    public User getuser(UUID id) {
       return userDb.get(id);
    }



    public boolean exists(User u){
        return userDb.containsKey(u.getId());
    }

    public void showBalance() {
        for(UUID key: userDb.keySet()){
            User user = userDb.get(key);
            System.out.println("Current Balance for : "+user.getName()+" is: "+user.getCoins());
        }
    }
}

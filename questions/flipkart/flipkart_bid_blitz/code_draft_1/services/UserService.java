package services;

import models.User;
import repositories.UserRepository;

public class UserService {

    UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(String name, int coins) {
        if(coins<=0) throw  new RuntimeException("Coin should be greater than 0");
        return userRepository.createUser(name, coins);
    }

    public void showBalance(){
        userRepository.showBalance();
    }

}

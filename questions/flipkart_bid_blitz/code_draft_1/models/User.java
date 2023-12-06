package models;

import java.util.UUID;

public class User {

    private String name;
    private UUID id;

    public void setCoins(int coins) {
        this.coins = coins;
    }

    private int coins;

    public User(String name, int coins) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public int getCoins() {
        return coins;
    }
}

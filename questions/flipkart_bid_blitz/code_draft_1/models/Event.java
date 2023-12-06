package models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.UUID;

public class Event {
    public String getName() {
        return name;
    }

    String name;
    UUID id;
    LocalDate date;
    String prize;
    HashSet<UUID> participants;


    public Bid getWinner() {
        return winner;
    }

    Bid winner;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    boolean isActive;


    public void setWinner(Bid winner) {
        this.winner = winner;
    }
    public Event( LocalDate date, String prize, String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.date = date;
        this.prize = prize;
        this.participants = new HashSet<>();
        this.isActive = true;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPrize() {
        return prize;
    }

    public HashSet<UUID> getParticipants() {
        return participants;
    }
}

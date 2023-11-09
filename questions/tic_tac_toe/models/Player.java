package models;

public class Player {

    String name;
    PieceTemplate piece;
    Player(String name, PieceTemplate p ){
        this.name = name;
        this.piece = p;
    }
}

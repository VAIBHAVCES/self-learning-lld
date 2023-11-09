package models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class TicTacToeGame {

    Board board;

    Deque<Player> players;
    public TicTacToeGame() throws  Exception{
        initializeGame();
    }
    protected void initializeGame() throws Exception{
        this.board = new Board(3);
        this.players = new LinkedList<>();
        Player p1 = new Player("Player-1", new PieceX());
        Player p2 = new Player("Player-2", new PieceO());

        players.addLast(p1);
        players.addLast(p2);

        startGame();
        // -> =[p1, p2]=

    }
    protected void startGame() throws Exception{
        boolean gameCompleted = false;
        while(!gameCompleted){

            board.printBoard();
            // which player's turn
            Player withTurn = players.removeFirst();
            BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
            System.out.println("This is "+ withTurn.name+"'s turn please enter your input : ");
            String line[] = bf.readLine().split(",");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            if(!board.addPiece(withTurn,x,y)){
                players.addFirst(withTurn);
                System.out.println("!!!! BEWARE!!! WRONG INPUT !! Give a non");
                continue;
            }
            gameCompleted = board.validatCompletion(x, y, withTurn);
            if(gameCompleted){
                System.out.println("Player : "+ withTurn.name + " with piece : "+withTurn.piece.pieceType+ " won !!!!");
            }
            players.addLast(withTurn);
        }
    }


}

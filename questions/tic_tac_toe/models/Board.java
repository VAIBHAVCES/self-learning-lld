package models;

public class Board {

    int size;
    PieceTemplate board[][];

    Board(int size){
        this.size = size;
        board = new PieceTemplate[size][size];
    }

    protected void printBoard(){

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("|\t");
                if(board[i][j]==null){
                    System.out.print(".\t");
                }else{
                    System.out.print(board[i][j].pieceType +"\t");
                }
                System.out.print("|\t");
            }
            System.out.println();
        }
    }

    protected boolean addPiece(Player p, int x, int y){

        if(board[x][y]!=null){
            return false;
        }
        board[x][y] = p.piece;
        return true;
    }

    protected  boolean validatCompletion(int x, int y, Player p){
        boolean ans = false;
        ans = ans || validateInX(x, p);
        ans = ans ||  validateInY(y, p);
        ans = ans ||  validateDigonals(x,y,p);
        return ans;
    }

//
    public boolean validateInX(int x, Player player ){
        int y  =0 ;
        while(y<board.length ){
            if(board[x][y]==null || !board[x][y].pieceType.equals(player.piece.pieceType)){
                return false;
            }
            y++;
        }
        return true;
    }
    public boolean validateInY(int y, Player player){
        int x  =0 ;
        while(x<board.length ){
            if(board[x][y]==null || !board[x][y].pieceType.equals(player.piece.pieceType)){
                return false;
            }
            x++;
        }
        return true;

    }
    public boolean validateDigonals(int tx, int ty, Player player){
        int ctr = 0;
        int moveUp[] = new int[]{-1,-1};
        int moveDown[] = new int[]{1,1};
        int x = tx;
        int y = ty;

        while(x>=0 && y>=0 ){


            if(board[x][y]==null || !board[x][y].pieceType.equals(player.piece.pieceType)){
                return false;
            }
            x+= moveUp[0];
            y+= moveUp[1];
            ctr++;
        }

        x = tx;
        y = ty;

        while(x<board.length && y<board.length ){


            if(board[x][y]==null || !board[x][y].pieceType.equals(player.piece.pieceType)){
                return false;
            }
            x+= moveDown[0];
            y+= moveDown[1];

            ctr++;
        }
        if(ctr==(board.length+1)){
            return true;
        }
        return false;

    }


}

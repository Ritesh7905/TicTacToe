import java.util.*;
public class Main {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                board[i][j]=' ';
            }
        }
        char player ='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player " +player+" enter :");
            int i=sc.nextInt();
            int j=sc.nextInt();
            sc.close();
            if(board[i][j]==' '){
                //place element
                board[i][j]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player"+ player+"has won");
                }
                else{
                    // if(player=='X'){
                    //     player='O';
                    // }
                    // else{
                    //     player='X';
                    // }
                    player =(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid move.Try again!");
            }
        }
        printBoard(board);
    }
    public static boolean haveWon(char[][] board,char player){
        for(int i=0;i<=2;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                return true;
            }
        }

        for(int j=0;j<=2;j++){
            if(board[0][j]==player && board[1][j]==player && board[2][j]==player){
                return true;
            }
        }

        
            if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }
            if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
                return true;
            }
        return false;
    }
    public static void printBoard(char[][] board){
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
}

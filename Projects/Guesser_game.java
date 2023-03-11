package Projects;

import java.util.*;

import javax.lang.model.util.ElementScanner6;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;

class Guesser {
    int guessnum;

    int guessingnumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number");
        guessnum = scan.nextInt();
        return guessnum;
    }

}

class player {
    int guessnum;

    int guessingnumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Player, guess the number");
        guessnum = scan.nextInt();
        return guessnum;
    }
}

class Umpire {
    int guessernum;
    int player1;
    int player2;
    int player3;

    void collectfromGuesser() {
        Guesser g = new Guesser();
        guessernum = g.guessingnumber();

    }

    void collectfromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        player1 = p1.guessingnumber();
        player2 = p2.guessingnumber();
        player3 = p3.guessingnumber();

    }

    void compare() {
        if (guessernum == player1) {
            if(guessernum==player2 && guessernum == player3){
                System.out.println("All of them are winner");
            }
            else if(guessernum==player2 ){
                System.out.println("Player 1 and 2 are winner");
            }
            else if( guessernum == player3){
                System.out.println("Player 1 and 3 are winners");
            }
            else{
                System.out.println("PLayer 1 Wins");
            }
        } 
        
        else if (guessernum == player2) {
            if (guessernum==player3){
                System.out.println("Player 2 and 3 are winners");

            }
            else{System.out.println("Player 2 WINs");}
        } 
        
        else if (guessernum == player3) {
            
            System.out.println("Player 3 WINs");
        }
        
        else{
            System.out.println("No one is correct");
        }
    }

}

public class Guesser_game {
    public static void main(String[] args) {
        System.out.println("Start the game");
        Umpire u= new Umpire();

        u.collectfromGuesser();

        u.collectfromPlayer();

        u.compare();
    }


}

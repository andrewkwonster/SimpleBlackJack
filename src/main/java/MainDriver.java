import java.util.ArrayList;
import java.util.List;

import models.Card;
import models.Player;

/**
 * Created by samskim on 6/8/16.
 */
public class MainDriver {

    public static void main(String[] args){

        Card A1 = new Card("Diamond", 5);
        Card A2 = new Card("Clover", 9);
        Card A3 = new Card("Diamond", 7);

        Card B1 = new Card("Heart", 10);
        Card B2 = new Card("Spade", 8);

        int Asum = A1.getNum() + A2.getNum() + A3.getNum();
        int Bsum = B1.getNum() + B2.getNum();


        Player playerA = new Player();
        List<Card> Acards = new ArrayList<Card>();
        Acards.add(A1);
        Acards.add(A2);
        Acards.add(A3);


        Player playerB = new Player();
        // TODO: create list of cards for player B and add some cards




        if (Asum > Bsum){
            System.out.println("Player A wins");
        }else if (Asum < Bsum){
            System.out.println("Player B wins");
        }else{
            System.out.println("Push");
        }
    }

    public static int getSumOfCards(Player player){
        // TODO: implement this method so that it adds all of the player's card and returns the sum
        return 0;
    }


    public static void deal(Player player){
        //TODO implement a method that deals a random card for a player
    }
}

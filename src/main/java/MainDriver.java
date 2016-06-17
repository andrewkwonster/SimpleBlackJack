import java.util.List;
import java.util.Random;

import models.Card;
import models.Player;


/**
 * Created by samskim on 6/8/16.
 */
public class MainDriver {

    public static void main(String[] args){
        Player playerA = new Player();
        Player playerB = new Player();

        deal(playerA);
        deal(playerB);
        deal(playerA);
        deal(playerB);

        /*
        TODO: print what cards the player currently has.
        Then, implement scanner here, so that the player can hit or stay


         */


        // then we can ask these players what to do : hit? or stay



        // when all of the dealing is done, we can compare using getSumOfCards
        printCards(playerA);
        printCards(playerB);

        int Asum = getSumOfCards(playerA);
        int Bsum = getSumOfCards(playerB);

        if (Asum > Bsum){
            System.out.println("Player A wins");
        }else if (Asum < Bsum){
            System.out.println("Player B wins");
        }else{
            System.out.println("Push");
        }


    }

    public static int getSumOfCards(Player player){
        int sum = 0;

        List<Card> cards = player.getCards();
        for (int i = 0; i < cards.size(); i++){

            Card card = cards.get(i);
            int number = card.getNum();
            sum += number;
        }

        return sum;
        // TODO: implement this method so that it adds all of the player's card and returns the sum
    }

    public static void deal(Player player){

        Random rand = new Random();
        int value = rand.nextInt(10);

        String[] shapes = {"Diamonds", "Hearts", "Clubs", "Spades"};
        int shapeIndex = rand.nextInt(4);

        Card card = new Card(shapes[shapeIndex], value);

        List<Card> cards = player.getCards();

        cards.add(card);

        //TODO implement a method that deals a random card for a player
    }

    public static void printCards(Player player){
        // TODO: print player's cards in a nice format
    }



}

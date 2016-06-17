import java.util.List;
import java.util.Random;

import models.Card;
import models.Player;


/**
 * Created by samskim on 6/8/16.
 */
public class MainDriver {

    public static void main(String[] args){

//        Card A1 = new Card("Diamond", 5);
//        Card A2 = new Card("Clover", 9);
//        Card A3 = new Card("Diamond", 7);
//
//        Card B1 = new Card("Heart", 10);
//        Card B2 = new Card("Spade", 8);
//        Card B3 = new Card("Diamond", 2);
//
//        int Asum = A1.getNum() + A2.getNum() + A3.getNum();
//        int Bsum = B1.getNum() + B2.getNum();
//
//
//        Player playerA = new Player();
//        List<Card> Acards = new ArrayList<Card>();
//        Acards.add(A1);
//        Acards.add(A2);
//        Acards.add(A3);
//
//        Player playerB = new Player();
//        List<Card> Bcards = new ArrayList<Card>();
//        Bcards.add(B1);
//        Bcards.add(B2);
//        Bcards.add(B3);
//
//        playerA.setCards(Acards);
//        playerB.setCards(Bcards);
//
//        int sumOfAsCards = getSumOfCards(playerA);
//        System.out.println("Sum of A's cards: " + sumOfAsCards);
//
//        int sumOfBsCards = getSumOfCards(playerB);
//        System.out.println("Sum of B's cards: " + sumOfBsCards);

        Player playerA = new Player();
        Player playerB = new Player();

        deal(playerA);
        deal(playerB);
        deal(playerA);
        deal(playerB);

        // then we can ask these players what to do : hit? or stay


        // when all of the dealing is done, we can compare using getSumOfCards
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

        //TODO implement a method that deals a random card for a player
    }
}

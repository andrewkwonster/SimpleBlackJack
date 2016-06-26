import java.util.List;
import java.util.Random;
import java.util.Scanner;

import models.Card;
import models.Player;


/**
 * Created by samskim on 6/8/16.
 */
public class MainDriver {

    public static void main(String[] args){
        Player playerA = new Player("A");
        Player playerB = new Player("B");

        deal(playerA);
        deal(playerB);
        deal(playerA);
        deal(playerB);

        printCards(playerA);
        printCards(playerB);
        System.out.println();

        System.out.println("hit/stay?");
        Scanner scan = new Scanner(System.in);
        String decision;

        boolean turnA = true;

        while (!(decision = scan.nextLine()).equals("stay")){


            if (turnA){
                deal(playerA);
                turnA = false;
            }else{
                deal(playerB);
                turnA = true;
            }

            printCards(playerA);
            printCards(playerB);
            System.out.println();
        }

        getResult(playerA, playerB);

    }

    private static void getResult(Player playerA, Player playerB) {

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
        int value = rand.nextInt(9) + 1;

        String[] shapes = {"Diamonds", "Hearts", "Clubs", "Spades"};
        int shapeIndex = rand.nextInt(4);

        Card card = new Card(shapes[shapeIndex], value);

        List<Card> cards = player.getCards();

        cards.add(card);

        //TODO implement a method that deals a random card for a player
    }

    public static void printCards(Player player){
        // TODO: print player's cards in a nice format

        List<Card> cards = player.getCards();
        System.out.println(player.getId());
        for (Card c: cards){
            System.out.println(c);
        }
    }

}

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import models.Card;
import models.Player;

/**
 * Created by samskim on 6/26/16.
 */
public class SimpleNumberGame {

  public static Set<Integer> set;

  public static void main(String[] args) {
    set = new HashSet<>();

    Player playerA = new Player("A");
    Player playerB = new Player("B");

    boolean turnA = true;

    while (set.size() < 10){

      if (turnA) {
        deal(playerA);
        turnA = false;
      }
      else{
        deal(playerB);
        turnA = true;
      }

    }

    getResult(playerA, playerB);

    // create a game of simple number game of 2 players
    // Game rules:
    // 1. Each player takes turn to choose a number from 1-11
    // 2. Whoever that has the higher sum wins
    // 3. If a number is dealt already, that number cannot be dealt again. (hint: use Set<Integer> to keep track
    // 4. Print Each player's sum of numbers, numbers they were dealt, each turn
    //    hint: create another Player class, use List<Integer> to store the numbers
    // 5. The game ends when all of the numbers 1-11 run out
    // 6. Show which player wins
    // Next week, we'll go over the answers


  }

  public static void deal(Player player){

    Random rand = new Random();
    int num = rand.nextInt(10) + 1;

    while (set.contains(num)){
      num = rand.nextInt(10) + 1;
    }

    set.add(num);

    List<Card> cards = player.getCards();
    Card card = new Card("shape", num);
    cards.add(card);


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

  public static void printCards(Player player){
    // TODO: print player's cards in a nice format

    List<Card> cards = player.getCards();
    System.out.println(player.getId());
    for (Card c: cards){
      System.out.println(c);
    }
  }

}

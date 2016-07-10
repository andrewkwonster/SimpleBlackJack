package models;

/**
 * Created by samskim on 7/10/16.
 */
public class Monkey extends Animal{

  int hands;

  public Monkey(){
    super();
  }

  public Monkey(int legs, int hands, double weight, String color) {
    super(legs, weight, color);
    this.hands = hands;
  }

  public int getHands() {
    return hands;
  }

  public void setHands(int hands) {
    this.hands = hands;
  }

  @Override
  public void eat(){
    System.out.println("Eating bananas");
  }
}

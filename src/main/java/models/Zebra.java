package models;

/**
 * Created by samskim on 7/10/16.
 */
public class Zebra extends Animal implements Edible{

  String stripeColor;


  public Zebra(int legs, double weight, String color, String stripeColor) {
    super(legs, weight, color);
    this.stripeColor = stripeColor;
  }

  @Override
  public void eat(){
    System.out.println("Grass is yummm");
  }

  @Override
  public void getEaten(Animal animal) {
    System.out.println("Run child! run!!!");
    animal.eat();
  }

  @Override
  public void getSunlight() {

  }
}

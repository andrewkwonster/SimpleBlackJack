package models;

/**
 * Created by samskim on 7/10/16.
 */
public class Grass implements Edible {

  @Override
  public void getEaten(Animal animal) {
    System.out.println("I'm being eaten by this " + animal);
    animal.eat();
  }

  @Override
  public void getSunlight() {

  }
}

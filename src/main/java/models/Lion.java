package models;

/**
 * Created by samskim on 7/10/16.
 */
public class Lion extends Animal {

  String hairColor;

  public Lion() {
    super();
  }

  public Lion(int legs, double weight, String color, String hairColor) {
    super(legs, weight, color);
    this.hairColor = hairColor;
  }

  public String getHairColor() {
    return hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  @Override
  public void eat(){
    System.out.println("Eating other animal");
  }
}

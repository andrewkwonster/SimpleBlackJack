package models;

/**
 * Created by samskim on 7/10/16.
 */
public class Animal {

  int legs;
  double weight;
  String color;

  public Animal(){}

  public Animal(int legs, double weight, String color) {
    this.legs = legs;
    this.weight = weight;
    this.color = color;
  }

  public void cry(){
    // needs more specification
    System.out.println("Crying!");
  }

  public void drinkWater(){
    System.out.println("Drinking water");
  }

  public void eat(){
    System.out.println("Eating something.. yummy!!");
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


}

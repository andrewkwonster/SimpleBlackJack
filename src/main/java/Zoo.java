import models.Animal;
import models.Grass;
import models.Lion;
import models.Monkey;
import models.Zebra;

/**
 * Created by samskim on 7/10/16.
 */
public class Zoo {

  public static void main(String[] args){

    Lion l1 = new Lion();
    l1.cry();

    l1.setLegs(4);
    System.out.println("Lion has " + l1.getLegs() + " legs");

    Monkey m1 = new Monkey(2, 2, 15, "Brown");

    m1.eat();
    l1.eat();

    if (m1 instanceof Animal){
      System.out.println("Monkey m1 is an animal");
    }

    if (m1 instanceof Monkey){
      System.out.println("Monkey is a monkey");
    }

    Animal a1 = new Animal(4, 17, "Black");

    if (a1 instanceof Animal){
      System.out.println("Animal is an animal");
    }

    if (a1 instanceof Monkey){
      System.out.println("Animal is a monkey");
    }

    Zebra z1 = new Zebra(4, 600, "white", "black");


    Grass grass = new Grass();
    grass.getEaten(z1);

    System.out.println("---- Now zebra meets a lion... ----");

    z1.getEaten(l1);


  }

}

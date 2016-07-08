package practices;

/**
 * Created by samskim on 7/1/16.
 */
public class ScopePractice {

  static String name;

  public static void main(String[] args){

    System.out.println(name);
    // print null

    generateName();
    // assign name = Andrew

    System.out.println(name);
    // print Andrew

    giveFriend();
    // append "Sam"

    System.out.println(name);
    // prints "Andrew Sam"

  }

  public static void generateName(){

    name = "Andrew";
  }

  public static void giveFriend(){

    name = name + " Sam";

  }

}

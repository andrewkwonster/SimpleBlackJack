package practices;

import java.util.Scanner;

/**
 * Created by samskim on 6/17/16.
 */
public class Scanners {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = scan.nextLine();

        System.out.println("Hello, " + name + ". How old are you?");


        int age = scan.nextInt();

        System.out.println("You are " + age + " years old.");



    }


}

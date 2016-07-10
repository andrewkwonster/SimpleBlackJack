import java.util.*;

import models.Person;

/**
 * Created by samskim on 7/8/16.
 */
public class NorthKorea {

  public static void main(String[] args) {
    // a dictator tries to keep record of the people in North Korea
    Set<Person> people = createPeople(100000);

    HashMap<Integer, Person> map = new HashMap<>();
    for (Person p : people) {
      map.put(p.id, p);
    }
    System.out.println(map.size());

    Set<Person> census = new HashSet<>();
    for (Person person : people) {
      if (person.id == 74431) {
        System.out.println(person.age + " " + person.name);
      }
    }
    Iterator<Person> i = census.iterator();
    while (i.hasNext()) {
      Person person = i.next();
      if (person.age < 18) {

      }
//    }


    /*
     You have a set of ~100,000 people living in North Korea
     1. What is the actual number of people?
     2. What is the name, age of the person whose id is 74431?  hint: might want to use hashset
     3. How many teenagers are there?
    */

    }
  }



  // Creating Random people.. don't worry about this part and below
  public static Set<Person> createPeople(int length){
    Set<Person> people = new HashSet<>();
    Random rand = new Random();
    for (int i = 0; i < length; i++){

      people.add(new Person(i, randomIdentifier(), 1 + rand.nextInt(70)));
    }
    return people;
  }

  static final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
  static final java.util.Random rand = new java.util.Random();
  static final Set<String> identifiers = new HashSet<String>();

  public static String randomIdentifier() {
    StringBuilder builder = new StringBuilder();
    while(builder.toString().length() == 0) {
      int length = rand.nextInt(5)+5;
      for(int i = 0; i < length; i++)
        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
      if(identifiers.contains(builder.toString()))
        builder = new StringBuilder();
    }
    return builder.toString();
  }

}

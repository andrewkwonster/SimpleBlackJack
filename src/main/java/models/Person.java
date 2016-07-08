package models;

/**
 * Created by samskim on 7/8/16.
 */
public class Person {

  private int id;
  private String name;
  private int age;

  public Person(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + age;
    return result;
  }

  public boolean equals(Object obj){
    Person other = (Person) obj;
    return (this.id == other.id && (this.name).equals(other.name) && this.age == other.age);
  }

  public String toString(){
    return "[id: " + id + ", name: " + name + ", age: " + age + "]";
  }


}

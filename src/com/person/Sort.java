package com.person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vpriyada
 *
 */
public class Sort {
  private void sortUsingLambda(List<Person> personList) {

    personList.add(new Person("Vijay", 53));
    personList.add(new Person("Ajay", 77));
    personList.add(new Person("Jai", 21));
    System.out.println("Sorting by Name...");
    Collections.sort(personList, (Person p1, Person p2) -> p2.getName().compareTo(p1.getName()));
    System.out.println(personList);
    System.out.println("Sorting by Age...");
    Collections.sort(personList, (Person p1, Person p2) -> p2.getAge().compareTo(p1.getAge()));
    System.out.println(personList);
  }

  public static void main(String[] args) {

    List<Person> personList = new ArrayList<Person>();
    Sort s = new Sort();
    s.sortUsingLambda(personList);
  }

}

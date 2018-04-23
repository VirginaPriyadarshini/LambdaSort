package com.person;


/**
 * @author vpriyada
 *
 */
public class Person {

  private String name;

  private Integer age;

  public Person() {
    super();
  }

  public Person(String name, Integer age) {
    super();
    this.name = name;
    this.age = age;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public Integer getAge() {

    return this.age;
  }

  public void setAge(Integer age) {

    this.age = age;
  }

  @Override
  public String toString() {

    return "Person [name=" + this.name + ", age=" + this.age + "]";
  }

}

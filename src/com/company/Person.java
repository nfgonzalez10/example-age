package com.company;

import java.io.*;
import java.util.*;

public class Person {
  int age = 0;

  Person(int initialAge) {
    this.age = initialAge;
    if (this.age < 0) {
      setNewAge(0);
      setNewMessage("Age is not valid, setting age to 0.");
    }
  }

  public void setNewMessage(String message) {
    System.out.println(message);
  }

  public void setNewAge(int newAge) {
    this.age = newAge;
  }

  void yearPasses() {
    setNewAge(this.age + 1);
  }

  void amIOld() {
    if (this.age >= 18) {
      setNewMessage("You are old.");
    }
    if (this.age < 13) {
      setNewMessage("You are young.");
    }
    if (this.age >= 13 && this.age < 18) {
      setNewMessage("You are teenager.");
    }
  }


  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      int age = Integer.parseInt(args[i]);
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
    }
  }
}
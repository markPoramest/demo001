package com.company;

public class Dog {
    String name;
    String breed;
    boolean sex;
    int age;

    void introduce() {
        System.out.println("I'm " + name);
    }

    void bark() {
        System.out.println("I'm barking");
    }

    Boolean sameBreed(String breed) {
        if (this.breed.equals(breed) ) {
            return true;
        } else  {
            return false;
        }

    }
}

package com.company;

public abstract class Mammal {
    String name;
    boolean sex;
    int age;

    public Mammal(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void introduce(){
        System.out.println("I'm mammal");
    }
    abstract void walk();
    abstract void eat();
}

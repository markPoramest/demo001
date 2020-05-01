package com.company;

public class Cat extends Mammal{
    private String eyeColor;

    public Cat(String name , boolean sex, int age ,String eyeColor) {
        super(name , sex , age);
        this.eyeColor = eyeColor;
    }

    public  void meow(){
        System.out.println("Meowz~");
    }

    @Override
    void walk() {

    }

    @Override
    void eat() {

    }
}

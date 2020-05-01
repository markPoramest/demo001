package com.company;

public class Dog extends Mammal implements Hunt{
    private String breed;

    public Dog(String name, boolean sex, int age , String breed) {
        super(name, sex, age);
        this.breed = breed;
    }

    void bark() {
        System.out.println("I'm barking");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    Boolean sameBreed(String breed) {
        if (this.breed.equals(breed) ) {
            return true;
        } else  {
            return false;
        }


    }

    @Override
    void walk() {

    }

    @Override
    void eat() {

    }

    @Override
    public void hunting() {
        System.out.println("I'm dog, I'm hunting cat");
    }
}

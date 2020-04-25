package com.company;

public class People {
    String name;
    boolean sex;
    int age;
    String nationality;
    public  People(String name){
        this.name = name;
        this.sex = true;
        this.age = 25;
    }
    public People(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        nationality = " ";
    }
    public People(String name , boolean sex , int age , String nationality){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
        introduce();
    }

    void introduce(){
        System.out.println("I'm "+name);
    }
    String calculateAge(int age){
       if(this.age == age){
            return "We are same age";
       }
       else if(this.age > age){
           return "I'm older than you";
       }
       else{
           return "I'm younger than you";
       }
    }
}

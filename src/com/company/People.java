package com.company;

public class People {
    private String name; //getter setter
    private boolean sex; //getter
    private int age; //setter getter
    private String nationality; //getter
    private String nationalID; //getter
    private String[] subject;
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
    public People(String name , boolean sex , int age , String nationality, String ID){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
        this.nationalID = ID;
    }

    public void introduce(){
        System.out.println("I'm "+name);
    }
    public String calculateAge(int age){
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
    public String getName(){
        return this.name;
    }
    public void setName(String name1){
        name = name1;
    }
    public boolean getSex(){
        return  this.sex;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNationalID() {
        return nationalID;
    }
}

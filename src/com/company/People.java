package com.company;

public class People extends Mammal implements Work{
    private String nationality; //getter
    private String nationalID; //getter
    private int salary;
    private String[] subject;

    public People(String name, boolean sex, int age , String nationality , String nationalID , int salary) {
        super(name, sex, age);
        this.nationality = nationality;
        this.nationalID = nationalID;
        this.salary = salary;
        subject = new String[2];
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void introduce(){
        System.out.println("I'm people");
    }

    @Override
    void walk() {
        System.out.println("I'm walking with 2 legs");
    }

    @Override
    void eat() {
        System.out.println("I'm eat breakfast");
    }

    void introduceMammal(){
        super.introduce();
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

    @Override
    public int working() {
        return salary*12;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People people = new People("Prayuth",true,60,"Thai","12456789",10);
        Dog dog = new Dog("Fufu",true,15,"Shihauahua");
        dog.hunting();
    }
}




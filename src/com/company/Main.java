package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People people = new People("Prayuth",true,60,"Thai","12456789");
        people.setName("Prawit");
        System.out.println(people.getName());
        System.out.println(people.getNationalID());

    }
}




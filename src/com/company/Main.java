package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int n1 = scan.nextInt();
        System.out.print("Input number 2 : ");
        int n2 = scan.nextInt();
        System.out.println("number1 + number 2 : "+(n1+n2));
        System.out.println("number1 - number 2 : "+(n1-n2));
        System.out.println("number1 * number 2 : "+(n1*n2));
        System.out.printf("number1 / number 2 : %.2f",(float)n1/n2);

    }
}

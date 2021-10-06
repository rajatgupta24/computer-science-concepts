package com.ConditionalAndLoops;

import java.util.Scanner;

public class powerInJava {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println("Enter the power");
        Scanner pow = new Scanner(System.in);
        int p = pow.nextInt();
        int power=1;
        for (int i=1;i<=p;i++) {
            power *= n;
        }

        System.out.println(power);
    }
}

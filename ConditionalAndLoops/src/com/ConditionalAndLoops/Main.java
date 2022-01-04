package com.ConditionalAndLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int out = 1;

        for (int i=0;i<n;i++) {
            out *= i+1;
        }

        System.out.println(n + "! is: " + out);
    }
}

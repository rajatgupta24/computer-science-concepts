package com.ConditionalAndLoops;

import java.util.Scanner;

public class AverageofNnumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i=0;i<n;i++) {
            sum += i+1;
        }

        System.out.println("Sum of " + n + "Numbers is: " + sum);
    }
}

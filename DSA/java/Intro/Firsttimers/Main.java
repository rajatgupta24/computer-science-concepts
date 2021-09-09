package Firsttimers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

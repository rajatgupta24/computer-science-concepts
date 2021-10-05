package com.ConditionalAndLoops;

import java.util.Scanner;

public class electricityBillCal {
    public static void main(String[] args) {
        System.out.println("Enter the units used");
        Scanner unit = new Scanner(System.in);
        int units = unit.nextInt();
        double bill = 0;

        if(units < 200)
            bill = units * 1.25;

        else if(units > 200 && units < 300) {
            bill = (units - 200) * 1.5;
            bill += (units - (units - 200)) * 1.25;
        }

        else if(units > 300 && units < 500) {
            bill = (units - 300) * 2;
            bill += (units - (units - 200)) * 1.5;
        }

        System.out.println("Your Bill is: " + bill);
    }
}

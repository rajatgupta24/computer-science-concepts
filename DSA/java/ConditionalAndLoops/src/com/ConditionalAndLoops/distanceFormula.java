package com.ConditionalAndLoops;

import java.util.Scanner;

public class distanceFormula {
    public static void main(String[] args) {
        System.out.println("Enter the cordinates two points in cartesian form: ");
        Scanner ax = new Scanner(System.in);
        Scanner ay = new Scanner(System.in);
        Scanner bx = new Scanner(System.in);
        Scanner by = new Scanner(System.in);

        double Ax = ax.nextDouble();
        double Ay = ay.nextDouble();
        double Bx = bx.nextDouble();
        double By = by.nextDouble();

        double dx = (Bx-Ax)*(Bx-Ax);
        double dy = (By-Ay)*(By-Ay);

        double d = Math.sqrt(dx + dy);
        System.out.println("Shortest distance between the a & b is: " + d);
    }
}

package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
//        double area = 3.14 * radius * radius;

        if (radius < 0) {
            System.out.println("Error: you must enter a positive number.");
            return;
        }


        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
        input.close();

    }
}

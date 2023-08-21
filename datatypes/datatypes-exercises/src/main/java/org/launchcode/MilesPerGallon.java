package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        float milesDriven = input.nextFloat();
        System.out.println("Enter gallons of gas used: ");
        float gallons = input.nextFloat();
        System.out.println("Your mileage is " + milesDriven / gallons);
    }
}

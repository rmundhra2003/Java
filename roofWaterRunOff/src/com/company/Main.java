package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double roofLength = 0;
        double roofWidth = 0;
        double rainfallInches = 0;
        double roofFootprint = 0;
        double rainfallGallons = 0;

        Scanner keyboard = new Scanner(System.in);

        //Input the roofLength
        System.out.print("Enter roof length in feet: ");
        roofLength = keyboard.nextDouble();

        //Input the roofWidth
        System.out.print("Enter roof width in feet: ");
        roofWidth = keyboard.nextDouble();

        //Input rainfallInches
        System.out.print("Enter rainfall in inches: ");
        rainfallInches = keyboard.nextDouble();

        //Calculate roof footprint in inches
        roofFootprint = roofLength * roofWidth * 12;

        //Calculate the rainfall in gallons
        rainfallGallons = (roofFootprint * rainfallInches)/231;

        //Display the run off
        System.out.println("The runoff is "+rainfallGallons);
    }
}

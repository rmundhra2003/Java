package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int employeeNumber = 0;
        double employeePayRate =0;
        int employeeHoursPerWeek = 0;
        double employeeWeeklyPay = 0;

        Scanner keyboard = new Scanner(System.in);
        // Read employeeNumber
        System.out.print("Enter Employee Number: ");
        employeeNumber = keyboard.nextInt();
        //Read employeePayRate
        System.out.print("Enter Employee Pay Rate: ");
        employeePayRate = keyboard.nextDouble();
        //Read employeeHoursPerWeek
        System.out.print("Enter Employee Hours per week: ");
        employeeHoursPerWeek = keyboard.nextInt();

        //Validate employeePayRate <= $25.00
        if(employeePayRate > 25){
            //If employeePayRate is out of range output error message
            System.out.printf("Invalid employeePayRate %f", employeePayRate);
            return;
        }
        //Validate employeeHoursPerWeek <= 60
        if(employeeHoursPerWeek > 60) {
            //If employeeHoursPerWeek is out of range output error message
            System.out.printf("Invalid employeeHoursPerWeek %d", employeeHoursPerWeek);
            return;
        }

        //If employeeHoursPerWeek <= 35
        if(employeeHoursPerWeek <= 35) {
            //Compute employeeWeeklyPay = employeePayRate*employeeHoursPerWeek
            employeeWeeklyPay = employeePayRate*employeeHoursPerWeek;
        }
        else {
            //Else
            //Compute employeeWeeklyPay = employeePayRate*35 + employeePayRate*1.5*(employeeHoursPerWeek-35)
            employeeWeeklyPay = employeePayRate*35 + employeePayRate*1.5*(employeeHoursPerWeek-35);
        }

        //Output employeeNumber and employeeWeeklyPay
        System.out.print("Employee Number "+employeeNumber+" Pay $"+employeeWeeklyPay);
    }
}

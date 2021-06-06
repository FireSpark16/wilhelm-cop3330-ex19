/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex19.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double weight = myApp.getWeight();
        double height = myApp.getHeight();
        double bmi = myApp.calcbmi(weight,height);
        myApp.outputbmi(bmi);
        if(bmi < 18.5)
            myApp.underweight();
        else if((bmi >= 18.5) && (bmi <= 25))
            myApp.normal();
        else
            myApp.obese();
    }

    private void normal() {
        System.out.println("You are within the ideal weight range.");
    }

    private void obese() {
        System.out.println("You are overweight. You should see your doctor.");
    }

    private void underweight() {
        System.out.println("You are underweight. You should see your doctor.");
    }

    private void outputbmi(double bmi) {
        System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");
    }

    private double calcbmi(double weight, double height) {
        return (weight / (height * height)) * 703;
    }

    private double getWeight() {
        System.out.print("What is your Weight (lbs)? ");
        int i = 0;
        while (i == 0)
        {
            try {
                i = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                i = 0;
                System.out.println("Please only input numbers.");
            }
        }
        return i;
    }

    private double getHeight() {
        System.out.print("What is your Height (in)? ");
        int i = 0;
        while (i == 0)
        {
            try {
                i = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                i = 0;
                System.out.println("Please only input numbers.");
            }
        }
        return i;
    }
}

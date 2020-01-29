package lab2;


import java.util.Scanner;

public class ExerciseLab2 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double w = SC.nextDouble();
        System.out.print("Enter your height(Meter): ");
        double h = SC.nextDouble();

        double bmi = w / (h * h);
        System.out.println("Your MBI is: " + bmi);


    }//main

}//class
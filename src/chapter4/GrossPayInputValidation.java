package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String[] args){

        double myWorkHours;
        double hourlyRate = 15;
        double maxWeeklyHours = 40;
        double minWeeklyHours = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("How many hours did you work this week?");
        myWorkHours = input.nextDouble();

        //validate input in a loop
        while ((myWorkHours > maxWeeklyHours) || (myWorkHours < minWeeklyHours)){
            System.out.println("Number of work hours must be between "+minWeeklyHours+" and "+maxWeeklyHours); //display error while input is not valid
            myWorkHours = input.nextDouble(); //accept another input.
        }
        input.close(); //close input stream.

        double grossPay = myWorkHours * hourlyRate;
        System.out.println("Gross Pay is $"+grossPay);


    }
}

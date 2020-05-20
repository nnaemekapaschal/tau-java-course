package chapter3;

import java.util.Scanner;

public class Change4DollarGame {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int penniesCentVal = 1;
        int nicklesCentVal = 5;
        int dimesCentVal = 10;
        int quartersCentVal = 25;
        int dollarCentVal = 100;
        int totalAmount;

System.out.println("Welcome to the Dollar for Change Game. \nThe Goal of the Game is to Enter Enough change to equal $1");

        System.out.println("How many pennies would you like?");
        int pennies = input.nextInt();

        System.out.println("How many nickels would you like?");
        int nickles = input.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = input.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = input.nextInt();

        totalAmount = pennies*penniesCentVal + nickles*nicklesCentVal + dimes*dimesCentVal + quarters*quartersCentVal;

        if (totalAmount == dollarCentVal){
            System.out.println("You won the Game!");
        }else if (totalAmount < dollarCentVal){
            System.out.println("Your change is less than $1 by " +(dollarCentVal - totalAmount)+ " Cents");
        }else if (totalAmount > dollarCentVal){
            System.out.println("Your change is more than $1 by " +(totalAmount - dollarCentVal)+ " Cents");
        }

    }
}

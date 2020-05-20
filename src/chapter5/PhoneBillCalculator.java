package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in); //create scanner object

        System.out.println("Enter Base Cost of the Plan: "); //prompt user to enter plan fee
        double planFee = input.nextDouble();

        System.out.println("Enter Number for Overage Minutes: "); //prompt user to enter overage minutes
        double overageMinutes = input.nextDouble();

        input.close(); //close the input stream.

        double overageFee = calculateOverage(overageMinutes);
        double subTotal = overageFee + planFee;
        double tax = calculateTax(subTotal);
        billTotal(planFee, overageFee, tax);

    }

    public static double calculateOverage(double overageMinutes){
        double overageMinuteCharge = 0.25;
        double overageFee = overageMinuteCharge * overageMinutes;
        return overageFee;
    }

    public static double calculateTax(double subTotal){
        double taxRate = 0.15;
        double tax =  taxRate * subTotal;
        return tax;
    }

    public static void billTotal(double planFee, double overageFee, double tax){
        double totalBill = planFee + overageFee + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+String.format("%.2f", planFee));
        System.out.println("Overage: $"+String.format("%.2f", overageFee));
        System.out.println("Tax: $"+String.format("%.2f", tax));
        System.out.println("Total: $"+String.format("%.2f", totalBill));

    }

}
package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //1. Get the number of hours worked
        System.out.println("Enter number of hours the employee worked.");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter employee's pay rate.");
        double rate = input.nextDouble();


        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("Gross Pay is " +grossPay);

        //close scanner to free up memory space
        input.close();
    }
}

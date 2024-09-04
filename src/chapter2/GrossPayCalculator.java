package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String arg []){
        //Get the number of hours worked
        //grossPayCalc();
        madLibs();

    }

    private static void grossPayCalc(){
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        //Get hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        double payRate = sc.nextDouble();
        //Multiply hours and pay rate
        double grossPay = hours * payRate;
        //Display result
        System.out.println("Gross pay is: " + grossPay);
    }

    private static void madLibs(){
        System.out.println("Enter the Season of the year: ");
        Scanner sc = new Scanner(System.in);
        String Season = sc.next();
        //Get a whole number
        System.out.println("Enter A whole number: ");
        int wholeNumber = sc.nextInt();
        //get an adjective
        System.out.println("Enter an adjective: ");
        String adjective = sc.next();
        //Display result
        System.out.println("On a/an " + adjective + " " + Season + " day, I drink a minimum of " +wholeNumber + " cups of coffee");
    }
}

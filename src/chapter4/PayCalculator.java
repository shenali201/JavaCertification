package chapter4;

import java.util.Scanner;

public class PayCalculator {
    public static void main (String arg []){
        int hourlyRate = 15;
        int maxHours = 40;

        System.out.println("Enter maximum hours worked");
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        while (hoursWorked > maxHours) {
            System.out.println("Wrong input. Enter hours between 1 to 40.");
            hoursWorked = sc.nextDouble();
        }
        sc.close();
        double gross = hourlyRate * hoursWorked;
        System.out.println("Hours worked: " + gross);

    }
}

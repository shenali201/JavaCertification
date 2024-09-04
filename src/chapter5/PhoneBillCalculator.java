package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner sc = new Scanner(System.in);
    static double taxOnSubtotal = 0.15;
    static double chargePerMinute = 0.25;

    public static void main(String arg[]) {

        System.out.println("Enter base cost of the plan:");
        double baseCost =  sc.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = sc.nextDouble();

        double overageCost = getOverageFees(overageMinutes);
        double totalTax = getTax(baseCost,overageCost);
        printTotal(totalTax, overageCost,baseCost);
    }

    public static double getTax(double baseCost, double overageCost ) {
        double totalTax = (overageCost + baseCost ) * taxOnSubtotal;
        return totalTax;
    }

    public static double getOverageFees(double overageMins) {
        double overageMinsTotal = overageMins * chargePerMinute;
        return overageMinsTotal;
    }

    public static void printTotal(double tax, double overage, double base ) {
        double total = tax+overage+base;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+ base );
        System.out.println("Overage: $"+ overage);
        System.out.println("Tax: $"+ tax);
        System.out.println("Total: $"+total);



    }

}
package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args []) {
        double expectedSalary = 30000;
        double expectedTenure = 2;

        System.out.println("Enter salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        System.out.println("Enter tenure: ");
        double tenure = sc.nextDouble();

        if (salary >= expectedSalary) {
            if (tenure >= expectedTenure){
                System.out.println("You are eligble for the loan");
        } else {
                System.out.println("You are not eligble for the loan. you require "
                + (expectedTenure - tenure) + " more years of tenure");
            }
        } else {
            System.out.println("You are not eligble for the loan. you require "
                    + (expectedSalary - salary) + " more salary");

        }
    }
}

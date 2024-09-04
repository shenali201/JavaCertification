package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main (String arg[]){

        boolean again = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();

            System.out.println("Enter number 2: ");
            int num2 = sc.nextInt();

            int total = num1 +num2;
            System.out.println("Total is "+ total);

            System.out.println("Would you like to start over");
            again = sc.nextBoolean();

        } while (again);

        sc.close();


    }
}

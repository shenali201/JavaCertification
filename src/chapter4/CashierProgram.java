package chapter4;

import java.util.Scanner;

public class CashierProgram {
    public static void main (String arg []){

        searchA();


    }

    public static void cashier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items will you like to scan? ");
        int scanItemCount = sc.nextInt();
        double total = 0;

        for (int i = 0; i<scanItemCount; i++) {
            System.out.println("Enter Cost of item ");
            double price = sc.nextDouble();

            total = total + price;
        }
        System.out.println("Total is " + total);
    }

    public static void searchA(){


        Scanner sc = new Scanner(System.in);

        boolean again = false;
        do {
        System.out.println("Enter a text: ");
        String word = sc.next();

            boolean letterFound = false;

            for (int i = 0; i < word.length(); i++) {
                char currentLetter = word.charAt(i);
                if (currentLetter == 'A' || currentLetter == 'a') {
                    letterFound = true;
                    break;
                }
            }
            if (letterFound) {
                System.out.println(" We found the letter");
            } else {
                System.out.println(" We didn't find the letter");
            }

            System.out.println(" Do you want to go again? ");
            again = sc.nextBoolean();

        } while (again);

        sc.close();

    }

}

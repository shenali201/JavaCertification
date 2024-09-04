package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int pennies = sc.nextInt();
        System.out.println("How many nickels would you like?");
        int nickles = sc.nextInt();
        System.out.println("How many dimes would you like?");
        int dimes = sc.nextInt();
        System.out.println("How many quarters would you like?");
        int quarters = sc.nextInt();

        int total = pennies + 5*nickles + 10*dimes + 25*quarters ;
        if (total == 100) {
            System.out.println( "You Win!");
        } else if (total > 100) {
            System.out.println( "You went over by " + (total - 100) + "cents");
        } else {
            System.out.println( "You went under by " + (100 - total) + "cents");
        }
    }
}

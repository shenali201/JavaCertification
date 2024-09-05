package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static int daysOfWeek[];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String arg []){
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        daysOfWeek = new int[7];

        System.out.println("Enter the day of the Week? ");
        int day = sc.nextInt();
        System.out.println("Day: " + week[day-1]);
    }

}

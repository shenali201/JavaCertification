package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main (String arg[]) {
        System.out.println("Enter test score: ");
        Scanner sc = new Scanner(System.in);
        int testScore = sc.nextInt();
        sc.close();
        String grade;

        if (testScore < 60) {
            grade = "F";
            } else if (testScore < 70){
            grade = "D";
            } else if (testScore < 80){
            grade = "C";
            } else if (testScore < 90){
            grade = "B";
        } else {
            grade = "A";
        }

        System.out.println("Your grade is " + grade);
    }
}

package chapter5;

import java.util.Scanner;

public class CreditChecker {
    static int minimumIncome = 25000;
    static int minimumCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main (String arg []){


        double income = getSalary();
        int creditScore = getCreditScore();
        sc.close();

        notifyUser(validateCredit(income,creditScore));
    }

    public static double getSalary (){
        System.out.println("what is your income?");
        double income = sc.nextDouble();
        return income;
    }

    public static int getCreditScore (){
        System.out.println("What is your credit score?");
        int creditScore = sc.nextInt();
        return creditScore;
    }

    public static boolean validateCredit (double income, int creditScore){
        if (income > minimumIncome && creditScore >= minimumCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified){
            System.out.println("Approved!!");
        }else {
            System.out.println("Rejected!!");
        }
    }

}

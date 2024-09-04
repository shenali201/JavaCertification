package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String arg[]){
        //salaryCalcScenario1();
        salaryCalcScenario2();
    }

    public static void salaryCalcScenario1 (){
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales were made this week?");
        Scanner sc = new Scanner(System.in);

        int sales = sc.nextInt();

        if (sales > quota ) {
            salary = salary + bonus;
        }
        System.out.println("Employee salary is: " + salary);
    }

    public static void salaryCalcScenario2 (){
        int quota = 10;

        System.out.println("How many sales were made this week?");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        if (sales >= quota )
            System.out.println(" Congratulations on reaching the sales quota!!");

        else {
            System.out.println(" You are short of " + (quota - sales) + " sales");
        }
    }
}

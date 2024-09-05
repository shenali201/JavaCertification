package chapter7;

import java.util.Scanner;

public class Grade {

    private static int grades[];
    private static Scanner sc = new Scanner(System.in);

    public static void main (String arg[]){

        System.out.println("How many grades do you like to enter? ");
        grades = new int[sc.nextInt()];

        getGrades();
        System.out.println("Average: " + gradeAverage() );
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());
    }

    public static void getGrades(){
        for(int i=0; i< grades.length; i++){
            System.out.println("Enter grade for subject "+ (i+1));
            int newGrade = sc.nextInt();
            grades[i] = newGrade;
        }
    }
    public static int gradeSum(){
     int total =0;
        for(int value : grades) {
            total = total + value;
        }
        return total;
    }

    public static int gradeAverage(){
        return gradeSum()/grades.length;
    }
    public static int getHighest(){
        int highest = 0;
        for (int value : grades){
            if(value > highest){
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for (int value : grades){
            if(value < lowest){
                lowest = value;
            }
        }
        return lowest;
    }

}

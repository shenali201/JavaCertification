package chapter4;

import java.util.Scanner;

public class AverageTestScore {

    public static void main (String arg []){
        int studentCount = 24;
        int studentTests = 4;
        Scanner sc = new Scanner(System.in);
        double total = 0;

        //get all students marks
        for (int i = 0; i < studentCount; i++){
            for (int x = 0; x< studentTests; x++){
                System.out.println("Enter marks for test " + (x+1));

                double marks = sc.nextDouble();
                total = total + marks;
            }
            double average = (total/studentTests);
            System.out.println("Average marks for student #" +(i+1) +": "+ average);
        }
sc.close();
    }
}

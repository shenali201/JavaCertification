package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String arg[]){
        System.out.println("Enter your grade: ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Great job";
                //break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "Do better";
                break;
            case "F":
                message = "Uh-oh";
                break;
            default:
                message = "error";
                break;
        }

        System.out.print(message);


    }
}

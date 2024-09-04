package chapter5;

import java.util.Scanner;

public class Greetings {

    public static void main (String arg []){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        returnName(name);
    }

    public static void returnName(String name){
        System.out.println("Helooooo: " + name);
    }

}

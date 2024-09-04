package chapter6;

import java.util.Scanner;

public class HomeCalculatorRedo {

    private Scanner sc = new Scanner(System.in);
    public static void main(String arg []) {


        HomeCalculatorRedo calculate = new HomeCalculatorRedo();
        Rectangle kitchen = calculate.getRoom();
        Rectangle bathroom = calculate.getRoom();
        double area = calculateArea(kitchen,bathroom);
        System.out.println("Total area "+ area);
        calculate.sc.close();
    }

    public Rectangle getRoom() {

        System.out.println("Enter length of your room: ");
        double length = sc.nextDouble();
        System.out.println("Enter width of your room: ");
        double width = sc.nextDouble();

        return new Rectangle(length,width);
    }

    private static double calculateArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}

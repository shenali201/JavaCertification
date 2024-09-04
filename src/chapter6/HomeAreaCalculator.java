package chapter6;

public class HomeAreaCalculator {

    public static void main(String arg []){

        //create instance of Rectangular class. Rectangle is the constructor.
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //create instance of Rectangular class.
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("AREA: " +totalArea);
    }
}

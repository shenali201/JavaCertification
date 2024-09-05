package chapter9;

public class TasteTester {
    public static void main (String arg[]){

        Cake cake = new Cake("Chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavour());
        System.out.println("Cake price: " + cake.getPrice());

    }
}

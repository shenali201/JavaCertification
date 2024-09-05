package chapter9;

public class Square extends Rectangle {

    @Override
    public int calculatePerimeter(){
        return sides*length;
    }

    public void print(){
        System.out.println("rectangle");
    }

}

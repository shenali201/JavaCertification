package chapter11;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double l, double w ){
        setLength(l);
        setWidth(w);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return width*length;
    }
}

package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle (){
        length = 0;
        width =0;
    }

    public Rectangle (double l, double w){
        this.length= l;
        setWidth(w);
    }

    public double getLength() {
        return length;
    }
    public void setLength(double receivedL) {
        this.length=receivedL;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double receivedW){
        this.width=receivedW;
    }


    public double calculatePerimeter(){
        return (2*length + 2*width);
    }

    public double calculateArea(){
        return length*width;
    }
}

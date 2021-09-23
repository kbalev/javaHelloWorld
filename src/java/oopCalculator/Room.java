package java.oopCalculator;

public class Room {

    //attributes
    double length;
    double height;
    double width;
    double emptyLength;
    double emptyWidth;
    double area;
    double emptyArea;
    double paintArea;

    //constructor
    public Room(){

    }

    //methods
    public double calcArea(){
        double a = (((length*height)*2)+((width*height)*2));
        this.area = a;
        return a;
    }
    public double calcEmpty(){
        double a =  (emptyLength*emptyWidth);
        this.emptyArea = a;
        return a;
    }
    public double calcTotal(){
        double a = area-emptyArea;
        this.paintArea = a;
        return a;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setEmptyLength(int eLength){
        this.emptyLength = eLength;
    }
    public void setEmptyWidth(int eWidth){
        this.emptyWidth = eWidth;
    }
}

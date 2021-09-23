package java.oopCalculator;

public class Paint {

    //attributes
    private String name;
    private double price;
    private int litPerTin;
    private double litPerSqMet;

    //constructor

    public Paint(String name){
        this.name = name;
        this.price = (Math.random()*42);
        this.litPerTin = (int) Math.round(Math.random()*7);
        this.litPerSqMet = ((Math.random()*42)/(Math.random()*7));
    }

    //methods
      //getters
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getLitPerTin(){return litPerTin;}
    public double getLitPerSqMet(){return litPerSqMet;}
       //painting
    public int calcReqTins(int area){
        return (int) Math.ceil(area/litPerSqMet);
    }
    public double calcCost(int reqTins){
        return reqTins*price;
    }

}

package helloworld;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dimensions of the wall you want to paint.");
        System.out.println("Height: ");
        int sideA = sc.nextInt();
        System.out.println("Width: ");
        int sideB = sc.nextInt();
        int wallArea = sideA*sideB;
        System.out.println("Does the wall have any windows or doors?");
        boolean windows = sc.nextBoolean();

        if (windows == true) {
            System.out.println("What is the total length of all windows and doors on this wall?");
            int emptyA = sc.nextInt();
            System.out.println("What is the total height of all windows and doors on this wall?");
            int emptyB = sc.nextInt();
            int emptyArea = emptyA*emptyB;
            wallArea = wallArea-emptyArea;
        };

        double litPerSqrMet = 3.56;
        int litPerTin = 6;
        double pricePerTin = 42.99;


        double litReq = wallArea/litPerSqrMet;
        double tinsReq = Math.ceil(litReq/litPerTin);
        double totalPrice = tinsReq*pricePerTin;
        System.out.println("£"+totalPrice);

    }
}

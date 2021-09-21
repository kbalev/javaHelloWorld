package helloworld;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){


        int weekday = (int) (Math.round(Math.random())*7+1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dimensions of the wall you want to paint.");
        System.out.println("Height: ");
        int sideA = sc.nextInt();
        System.out.println("Width: ");
        int sideB = sc.nextInt();
        int wallArea = sideA*sideB;
        System.out.println("Does the wall have any windows or doors?");
        boolean windows = sc.nextBoolean();

        if (windows) {
            System.out.println("What is the total length of all windows and doors on this wall?");
            int emptyA = sc.nextInt();
            System.out.println("What is the total height of all windows and doors on this wall?");
            int emptyB = sc.nextInt();
            int emptyArea = emptyA*emptyB;
            wallArea = wallArea-emptyArea;
        }
//          Trying to create objects, will fix later
        //
//        System.out.println("Would you like the room to be painted black, white, red, orange or green?")
//        String colour = sc.nextLine();
//        class Colour {
//            double litPerSqrMet = 0;
//            int litPerTin = 0;
//            double pricePerTin = 0;
//        };
//
//        Colour black = new Colour();
//        Colour white = new Colour();
//        Colour red = new Colour();
//        Colour orange = new Colour();


        double litPerSqrMet = 3.56;
        int litPerTin = 6;
        double pricePerTin = 42.99;


        double litReq = wallArea/litPerSqrMet;
        double tinsReq = Math.ceil(litReq/litPerTin);
        double totalPrice = tinsReq*pricePerTin;

        switch (weekday) {
            case 1 -> {
                System.out.println("It's Monday and we have a 10% discount on all paint!");
                totalPrice = totalPrice * 0.9;
            }
            case 2 -> {
                System.out.println("It's Tuesday and we have a 20% discount on all paint!");
                totalPrice = totalPrice * 0.8;
            }
            case 3 -> {
                System.out.println("It's Wednesday and we have a 2-for-1 deal on all paint!");
                tinsReq = Math.ceil(((tinsReq*2)/3));
                totalPrice = tinsReq*pricePerTin;
            }
        }

        if (weekday < 4){
            System.out.println("Thank you for choosing to shop with us today, we hope you were satisfied with the deals on offer");
        } else {
            System.out.println("Thank you for shopping with us today, we hope you come again soon. If you come early next week, you may be able to snag some of our special offers.");
        }
        System.out.println("£"+totalPrice);

    }
}

package helloworld;
import java.util.HashMap;
import java.util.Scanner;

public class calculator {
    public static void print(String text){
        System.out.println(text);
    }
    public static int weekday(){
        return (int) (Math.round(Math.random())*7+1);
    };
    public static void main(String[] args) throws InterruptedException {

        String[] paints = {"red", "black", "blue", "orange"};
        int weekday = weekday();
        Scanner sc = new Scanner(System.in);
        print("Please enter the dimensions of the wall you want to paint.");
        print("Height: ");
        int sideA = sc.nextInt();
        print("Width: ");
        int sideB = sc.nextInt();
        int wallArea = sideA*sideB;
        print("Does the wall have any windows or doors?");
        boolean windows = sc.nextBoolean();

        if (windows) {
            print("What is the total length of all windows and doors on this wall?");
            int emptyA = sc.nextInt();
            print("What is the total height of all windows and doors on this wall?");
            int emptyB = sc.nextInt();
            int emptyArea = emptyA*emptyB;
            wallArea = wallArea-emptyArea;
        }

        print("Your paint options are as follows: ");
        for ( String paint :paints ) {
            System.out.println(paint);
        }

        // Adding this to have an extra commit and be on level with Harrison
        double litPerSqrMet = 3.56;
        int litPerTin = 6;
        double pricePerTin = 42.99;


        double litReq = wallArea/litPerSqrMet;
        double tinsReq = Math.ceil(litReq/litPerTin);
        double totalPrice = tinsReq*pricePerTin;

        switch (weekday) {
            case 1 -> {
                print("It's Monday and we have a 10% discount on all paint!");
                totalPrice = totalPrice * 0.9;
            }
            case 2 -> {
                print("It's Tuesday and we have a 20% discount on all paint!");
                totalPrice = totalPrice * 0.8;
            }
            case 3 -> {
                print("It's Wednesday and we have a 2-for-1 deal on all paint!");
                tinsReq = Math.ceil(((tinsReq*2)/3));
                totalPrice = tinsReq*pricePerTin;
            }
        }

        for (int i=5; i>=0; i-- ){
            print("We are calculating your order. Please wait another " + i + " seconds.");
            Thread.sleep(1000);
        }

        if (weekday < 4){
            print("Thank you for choosing to shop with us today, we hope you were satisfied with the deals on offer");
        } else {
            print("Thank you for shopping with us today, we hope you come again soon. If you come early next week, you may be able to snag some of our special offers.");
        }
        print("£"+totalPrice);

    }
}

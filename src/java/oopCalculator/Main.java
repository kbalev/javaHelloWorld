package java.oopCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        int weekday = (int) (Math.round(Math.random())*7+1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome to the Paint Shop.");
        System.out.println("I will be helping you with your purchase today.");
        System.out.println("To begin, let us have the dimensions of the room you want to paint.");
        System.out.println("Height: ");
        Room room = new Room();
        room.setHeight(sc.nextInt());
        System.out.println("Width: ");
        room.setWidth(sc.nextInt());
        System.out.println("Length ");
        room.setLength(sc.nextInt());
        System.out.println("Does the room have any windows or doors you don't want to paint over?");
        String winDoors = sc.nextLine();
        if(winDoors.equals("Yes")){
            System.out.println("What is the total length of all windows and doors in this room?");
            room.setEmptyLength(sc.nextInt());
            System.out.println("What is the total height of all windows and doors in this room?");
            room.setEmptyWidth(sc.nextInt());
        }
        System.out.println("What colour paint would you like to use?");
        Paint choice = new Paint(sc.nextLine());
        System.out.println("You have chosen " + choice.getName() + ".");
        System.out.println("The price per tin is " + choice.getPrice() + ".");



    }
}

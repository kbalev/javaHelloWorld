package helloworld;
//make sure not to add things to the package with no name

public class Main {
    //public class can be used by anything
    public static void main(String[] args){
        //static means that something belongs to the class and not to the instance of the class.
        //this variable/method belongs to the class not the instance
        //as a result we don't need to create a new instance of the class
        // our main (not the "main") method will always be static
        // void means it is not expecting a return (void is a return type, there are others)
        // string[]args is the arguments we are passing into the program from outside.
        // tells the program to run in a particular way (can be a security concern)
        System.out.println("Hello world");
        // the above is bad practice because when you write to the console, if you are not looking at the console, it gets lost.
        // things should be written out to logs so that data persists throughout sessions.
        // logging is very important
        // there is such a thing as log values where they can log the problems to a file.
        int a = 5;
        String name = "Steve";
        System.out.println(a);
        System.out.println(name);

        int b = 42;
        double d = 36.3333333333333333333333333;
        long l = 100000000;
        char x = 'x';
        boolean t = true;
        short s = 50;
        float f = (float) 12.211111199111;
        System.out.println(b);
        System.out.println(d);
        System.out.println(l);
        System.out.println(x);
        System.out.println(t);
        System.out.println(s);
        System.out.println(f);
        System.out.println(b+d);
        System.out.println(f+b);
        System.out.println(x+b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        int one = 1;
        String theOtherOne = "1";
        System.out.println(one+theOtherOne);
        System.out.println(1+"1");





    }
}

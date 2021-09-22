package theZoo;

public abstract class Mammal extends Animal{

    ////attributes///

    ////constructors////

    ///methods///
    public void breathe(){
        System.out.println("Breathe in..... breathe out");
    }

    @Override
    public void reproduce() {
        System.out.println("I do a live birth");
    }

}

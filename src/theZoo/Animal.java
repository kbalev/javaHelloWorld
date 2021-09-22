package theZoo;

public abstract class  Animal {

    //attributes//

    //constructors//

    //methods//
    public abstract void breathe();

    public abstract void eat();

    public void sleep(){
        System.out.println("I am seeping.");
    };

    public void die(){
        System.out.println("I am dead");
    }

    public abstract void reproduce();


}

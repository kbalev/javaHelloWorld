package theZoo;

public class DuckBilledPlatypuss extends Mammal{
    @Override
    public void eat() {
        System.out.println("I eat fish");
    }

    @Override
    public void reproduce(){
        System.out.println("I lay eggs");
    }
}

package theZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args){
        List<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Bat());
        zoo.add(new Cat());
        zoo.add(new DuckBilledPlatypuss());

        for(Animal a:zoo){
            System.out.println(a.getClass());
            a.breathe();
            a.die();
            a.eat();
            a.sleep();
            a.reproduce();
            System.out.println();
            if(a instanceof Flying){
                ((Flying) a).takeOff();
                ((Flying) a).fly();
                ((Flying) a).land();
            }

        }




    }

}

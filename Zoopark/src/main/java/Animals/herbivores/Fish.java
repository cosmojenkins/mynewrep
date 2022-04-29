package Animals.herbivores;

import Animals.Herbivores;
import interfaces.Swim;

public class Fish extends Herbivores implements Swim {

    public Fish(String name, int age){
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}

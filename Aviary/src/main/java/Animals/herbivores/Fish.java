package Animals.herbivores;

import Animals.Herbivores;
import Kletka.SizeList;
import interfaces.Swim;

public class Fish extends Herbivores implements Swim {
    public Fish(String name, int age, SizeList size) {
        this.name = name;
        this.age = age;
        this.satiety = 3;
        this.size = size;
    }

    public void swim() {
        System.out.println("I can swim!");
    }
}

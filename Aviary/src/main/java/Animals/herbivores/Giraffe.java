package Animals.herbivores;

import Animals.Herbivores;
import Kletka.SizeList;
import interfaces.Run;

public class Giraffe extends Herbivores implements Run {

    public Giraffe(String name, int age, SizeList size) {
        this.name = name;
        this.age = age;
        this.satiety = 5;
        this.size = size;
    }

    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }
}

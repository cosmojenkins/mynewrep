package Animals.carnivores;

import Animals.Carnivores;
import Kletka.SizeList;
import interfaces.Run;
import interfaces.Voice;

public class Wolf extends Carnivores implements Run, Voice {

    private String voice;

    public Wolf(String name, int age, String voice, SizeList size) {
        this.name = name;
        this.age = age;
        this.satiety = 5;
        this.voice = voice;
        this.size = size;
    }

    public String voice() {
        return this.voice;
    }

    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }
}

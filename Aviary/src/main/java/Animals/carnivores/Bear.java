package Animals.carnivores;

import Animals.Carnivores;
import Kletka.SizeList;
import interfaces.Run;
import interfaces.Voice;

public class Bear extends Carnivores implements Run, Voice {

    private String voice;

    public Bear(String name, int age, String voice, SizeList size) {
        this.name = name;
        this.age = age;
        this.satiety = 10;
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
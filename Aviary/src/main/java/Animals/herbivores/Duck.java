package Animals.herbivores;

import Animals.Herbivores;
import interfaces.Fly;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Duck extends Herbivores implements Swim, Fly, Voice, Run {
    String voice;

    public Duck(String name, int age, String voice) {
        super(name, age);
        this.voice = voice;
    }

    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }

    public void fly() {
        System.out.println("I can fly!");
    }

    public void swim() {
        System.out.println("I can swim!");
    }

    public String voice() {
        return this.voice;
    }
}

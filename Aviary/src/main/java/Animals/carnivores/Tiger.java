package Animals.carnivores;

import Animals.Carnivores;
import Kletka.SizeList;
import interfaces.Run;
import interfaces.Voice;

public class Tiger extends Carnivores implements Run, Voice {

    private String voice;

    public Tiger(String name, int age, String voice, SizeList size) { /* если передаем, то у каждого свое будет, а в данный момент стандартизированно */
        this.name = name;
        this.age = age;
        this.satiety = 4;
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

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Animals.carnivores;

import Animals.Carnivores;
import Foods.Food;
import interfaces.Run;
import interfaces.Voice;

public class Tiger extends Carnivores implements Run, Voice {
    private String voice;

    public Tiger(String name, int age, String voice) {
        super(name, age);
        this.voice = voice;
    }

    public String voice() {
        return this.voice;
    }

    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }

    public void eat(Food food) {
        super.eat(food);
    }
}

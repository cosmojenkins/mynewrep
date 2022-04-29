package Animals.carnivores;

import Animals.Animals;
import Foods.Food;
import interfaces.Run;
import interfaces.Voice;
import Animals.Carnivores;

public class Bear extends Carnivores implements Run, Voice {

    private String voice;

    public Bear(String name, int age, String voice){
        super(name, age);
        this.voice = voice;

    }

    @Override
    public String voice() {
        return this.voice;
    }

    @Override
    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}

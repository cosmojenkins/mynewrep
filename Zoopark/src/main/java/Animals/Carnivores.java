package Animals;

import Foods.Food;
import Foods.Meat;

public abstract class Carnivores extends Animals{

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Carnivores(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            this.satiety = this.satiety + food.getSatiety();
            System.out.println(ANSI_GREEN + "Thats right food" + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED + "That was mistake. Carnivores doesnt eat grass" + ANSI_RESET);
        }
    }
}

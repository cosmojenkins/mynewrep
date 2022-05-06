package Animals;

import Foods.Food;
import Foods.Grass;

public abstract class Herbivores extends Animals {
    public static final String ANSI_RED = "\u001b[31m";
    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_GREEN = "\u001b[32m";

    public Herbivores(String name, int age) {
        super(name, age);
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            this.satiety += food.getSatiety();
            System.out.println( ANSI_GREEN + "Thats right food" + ANSI_RESET);
        } else {
            System.out.println( ANSI_RED + "That was mistake. Herbivores doesnt eat meat" + ANSI_RESET);
        }

    }
}

package Animals;

import Foods.Food;
import Foods.Meat;
import Foods.WrongFoodExeptions;

public abstract class Carnivores extends Animals {

    public static final String ANSI_RED = "\u001b[31m";
    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_GREEN = "\u001b[32m";

    public void eat(Food food) throws WrongFoodExeptions {
        if (food instanceof Meat) {
            this.satiety += food.getSatiety();
            System.out.println(ANSI_GREEN + "Thats right food" + ANSI_RESET);
            throw new WrongFoodExeptions(ANSI_RED + "That was mistake. Carnivores doesnt eat grass" + ANSI_RESET);
        }
    }
}
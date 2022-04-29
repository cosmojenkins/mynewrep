package Animals;

import Foods.Food;

public abstract class Animals {

    protected String name;
    protected int age;
    protected int satiety = 10;

    public Animals(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void eat(Food food);
}

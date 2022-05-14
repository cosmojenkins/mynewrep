package Animals;

import Foods.Food;
import Foods.WrongFoodExeptions;
import Kletka.SizeList;

import java.util.Objects;

public abstract class Animals {

    protected String name;
    protected int age;
    protected int satiety;
    protected SizeList size;

    public String getName() {
        return name;
    }

    public SizeList getSizeAnimal() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this.getClass() != obj.getClass())
            return false;

        if (this.getClass() == obj.getClass())
            return this.name == ((Animals) obj).name;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    public abstract void eat(Food var1) throws WrongFoodExeptions;
}

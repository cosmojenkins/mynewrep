import Animals.Animals;
import Animals.carnivores.Bear;
import Animals.carnivores.Tiger;
import Animals.carnivores.Wolf;
import Animals.herbivores.Duck;
import Foods.Food;
import Foods.WrongFoodExeptions;

public class Worker {
    public void feed(Animals animals, Food food) throws WrongFoodExeptions {
        animals.eat(food);
    }

    public void getVoice(Tiger tiger) {
        System.out.println("Worker ABUSING animal with " + tiger.voice());
    }

    public void getVoice(Bear bear) {
        System.out.println("Worker ABUSING animal with " + bear.voice());
    }

    public void getVoice(Wolf wolf) {
        System.out.println("Worker ABUSING animal with " + wolf.voice());
    }

    public void getVoice(Duck duck) {
        System.out.println("Worker ABUSING animal with " + duck.voice());
    }
}

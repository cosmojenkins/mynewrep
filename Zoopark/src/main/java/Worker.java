import Animals.Animals;
import Animals.carnivores.Bear;
import Animals.carnivores.Tiger;
import Animals.carnivores.Wolf;
import Animals.herbivores.Duck;
import Foods.Food;

public class Worker {
    public void feed(Animals animals, Food food){
        animals.eat(food);
    }
    public void getVoice(Tiger tiger){
        System.out.println(tiger.voice());
    }
    public void getVoice(Bear bear){
        System.out.println(bear.voice());
    }
    public void getVoice(Wolf wolf){
        System.out.println(wolf.voice());
    }
    public void getVoice(Duck duck){
        System.out.println(duck.voice());
    }
}

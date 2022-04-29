import Animals.Animals;
import Animals.carnivores.Bear;
import Animals.carnivores.Tiger;
import Animals.carnivores.Wolf;
import Animals.herbivores.Duck;
import Animals.herbivores.Fish;
import Animals.herbivores.Giraffe;
import Foods.Grass;
import Foods.Meat;
import interfaces.Swim;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Tiger Vanya", 3, "Tiger Voices: Arrrr");
        Wolf wolf = new Wolf("Wolf Petya", 2, "Wolf Voice: Agrrr");
        Bear bear = new Bear("Bear Vanya", 5, "Bear Voice: Aaaar");
        Duck duck = new Duck("Duck Vasiliy Fillipovich", 6, "Duck Voice: Qvaqva");
        Fish fish = new Fish("Fish Max", 4);
        Giraffe giraffe = new Giraffe("Giraffe Daniil", 178);
        Fish fish2 = new Fish("Fish Duft", 124);

        Worker worker = new Worker();
        Meat meat = new Meat(5);
        Grass grass = new Grass(3);

        System.out.println();
        duck.run();
        tiger.run();
        bear.run();
        wolf.run();
        giraffe.run();
        System.out.println();

        worker.feed(tiger, meat);
        worker.feed(tiger, grass);
        System.out.println();
        worker.feed(wolf, meat);
        worker.feed(wolf, grass);
        System.out.println();
        worker.feed(bear, meat);
        worker.feed(bear, grass);
        System.out.println();
        worker.feed(duck, meat);
        worker.feed(duck, grass);
        System.out.println();
        worker.feed(fish, meat);
        worker.feed(fish, grass);
        System.out.println();
        worker.feed(giraffe, meat);
        worker.feed(giraffe, grass);
        System.out.println();

        Swim[] pond = new Swim[]{fish, duck, fish2};
        for (int i = 0; i < 3; i++) {
            pond[i].swim();
        }


        System.out.println();
        System.out.println("1. " + tiger.voice());
        System.out.println("2. " + bear.voice());
        System.out.println("3. " + wolf.voice());
        System.out.println("4. " + duck.voice());

    }
}

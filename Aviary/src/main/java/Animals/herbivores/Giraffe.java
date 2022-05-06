
package Animals.herbivores;

import Animals.Herbivores;
import interfaces.Run;

public class Giraffe extends Herbivores implements Run {
    public Giraffe(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.println("My name is " + this.name + " and i can run!");
    }
}

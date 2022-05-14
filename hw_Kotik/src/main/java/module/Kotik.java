package module;


import java.util.Random;

@SuppressWarnings("all")
public class Kotik {

    private int satiety = 10;
    private int weight;
    private String name;
    private int prettiness;
    private String meow;
    private int myaso = 5;
    private static int countCat;


    public Kotik(int pretiness, String name, int weight, String meow) {
        this.prettiness = pretiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        countCat++;

    }
    public static int getCountCat() {
        return countCat;
    }

    public Kotik() {
        countCat++;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    String[] food = {"Whiskas", "Friskas", "Kiti-cat"};

    private boolean play() {
        if (satiety > 0) {
            System.out.println("Котик Пушистик играет");
            satiety--;
            return true;
        } else {
            System.out.println("Покормите кота, люди");
            return false;
        }
    }

    private boolean sleep() {
        if (satiety > 0) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else {
            System.out.println("Покормите кота, люди");
            return false;
        }
    }

    private boolean chaseMouse() {
        if (satiety > 0) {
            System.out.println("Котик бегает за мышкой");
            satiety--;
            return true;
        } else {
            System.out.println("Покормите кота, люди");
            return false;
        }
    }

    private boolean eat() {
        Random random = new Random();
        eat(food[(int) (Math.random() * 3)], (int) (Math.random() * 10)); //?
        return true;
    }

    private boolean eat(int myaso) {
        satiety = satiety + myaso;
        System.out.println("Кошак поел");

        return true;

    }

    private boolean eat(String food, int food2) {
        satiety = satiety + food2;
        System.out.println("Котяра поел " + food);

        return true;
    }

    private boolean jump() {
        if (satiety > 0) {
            System.out.println("Котик прыгает");
            satiety--;
            return true;
        } else {
            System.out.println("Котик хочет кушац");
            return false;
        }

    }

    public void liveAnotherDay() {

        for (int i = 0; i < 25; i++) {

            int b = (int) (Math.random() * 5 + 1);
            System.out.print(i + "\t");
            switch (b) {
                case 1:
                    eat();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    jump();
                    break;
                case 4:
                    chaseMouse();
                    break;
                case 5:
                    play();
                    break;
            }

        }
    }

}



package Foods;

public abstract class Food {
    protected int satiety;

    public Food() {
    }

    public int getSatiety() {
        return this.satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
}

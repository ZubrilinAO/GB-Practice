package HW_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }
}
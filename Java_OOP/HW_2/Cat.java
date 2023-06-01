package HW_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            fullness = true;
        }
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public boolean isFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}

package HW_1;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return this.calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - %f - [калорий: %d]", brand, name, price, calories);
    }
}
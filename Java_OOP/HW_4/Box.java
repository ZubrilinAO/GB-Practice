package HW_4;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }

        return weight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return (Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001);
    }

    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }

        if (this.fruits.isEmpty()) {
            return;
        }

        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}

package HW_2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 7),
                new Cat("Pushok", 10)
        };
        Plate plate = new Plate(20);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat " + cat.getName() + " is " + (cat.isFullness() ? "full" : "hungry"));
        }

        plate.info();
        plate.addFood(10);
        plate.info();
    }
}

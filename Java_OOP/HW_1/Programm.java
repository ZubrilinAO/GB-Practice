package HW_1;

import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        Product chocolate1 = new Chocolate("Nestle", "Dark chocolate", 5.0, 150);
        Product chocolate2 = new Chocolate("Hershey's", "Milk chocolate", 4.0, 100);
        Product chocolate3 = new Chocolate("Lindt", "White chocolate", 6.0, 200);
        Product chocolate4 = new Chocolate("Godiva", "Dark chocolate2", 8.0, 50);

        System.out.println(chocolate1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);

        VendingMachine vendingMachine = new VendingMachine(products);

        Chocolate chocolateResult = vendingMachine.getChocolate("White chocolate");
        if (chocolateResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        } else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }
}

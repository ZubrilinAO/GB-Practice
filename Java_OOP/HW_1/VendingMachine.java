package HW_1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Chocolate getChocolate(String name) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                if (((Chocolate) product).name.equalsIgnoreCase(name)) {
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }
}

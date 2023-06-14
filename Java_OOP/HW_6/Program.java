package HW_6;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите заказ:");
        Order order = OrderInput.inputOrder();
        OrderWriter.writeOrderToJson(order);
    }
}
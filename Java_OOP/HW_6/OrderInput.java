package HW_6;

import java.util.Scanner;

class OrderInput {

    private static Scanner scanner = new Scanner(System.in);

    public static Order inputOrder() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        double price = Double.parseDouble(prompt("Price: "));
        return new Order(clientName, product, qnt, price);
    }

    private static String prompt(String message) {

        System.out.print(message);
        return scanner.nextLine();
    }
}
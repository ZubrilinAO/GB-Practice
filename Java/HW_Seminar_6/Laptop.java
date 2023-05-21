package HW_Seminar_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Laptop(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand + " - " + ram + "GB RAM - " + storage + "GB storage - " + operatingSystem + " - " + color;
    }

    public static void filterLaptops(Laptop[] laptops) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> filterCriteria = new HashMap<>();
        System.out.println(
                "Enter number(s) of the filter criteria you want to apply (entering parameters separated by commas):");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage");
        System.out.println("3 - Operating System");
        System.out.println("4 - Color");
        String input = scanner.nextLine();
        String[] filters = input.split(",");
        for (String filter : filters) {
            System.out.println("Enter minimum value for filter " + filter + ": ");
            String value = scanner.nextLine();
            if (value.trim().length() > 0) {
                filterCriteria.put(filter.trim(), value.trim());
            }
        }
        for (Laptop laptop : laptops) {
            boolean shouldDisplay = true;
            for (String key : filterCriteria.keySet()) {
                String value = filterCriteria.get(key);
                switch (key) {
                    case "1":
                        if (laptop.getRam() < Integer.parseInt(value)) {
                            shouldDisplay = false;
                        }
                        break;
                    case "2":
                        if (laptop.getStorage() < Integer.parseInt(value)) {
                            shouldDisplay = false;
                        }
                        break;
                    case "3":
                        if (!laptop.getOperatingSystem().toLowerCase().contains(value.toLowerCase())) {
                            shouldDisplay = false;
                        }
                        break;
                    case "4":
                        if (!laptop.getColor().toLowerCase().contains(value.toLowerCase())) {
                            shouldDisplay = false;
                        }
                        break;
                }
            }
            if (shouldDisplay) {
                System.out.println(laptop.toString());
            }
        }
        scanner.close();
    }
}

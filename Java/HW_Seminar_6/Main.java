package HW_Seminar_6;

public class Main {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[5];
        laptops[0] = new Laptop("Dell", 16, 500, "Windows 10", "Silver");
        laptops[1] = new Laptop("Apple", 8, 256, "MacOS", "Space Gray");
        laptops[2] = new Laptop("HP", 12, 1000, "Windows 10", "Black");
        laptops[3] = new Laptop("Samsung", 4, 1000, "Windows 10", "Red");
        laptops[4] = new Laptop("Lenovo", 16, 2000, "Windows 10", "Black");

        Laptop.filterLaptops(laptops);
    }
}

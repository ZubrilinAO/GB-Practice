package HW_4;

public class Program {

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());
        System.out.println("orangeBox weight: " + orangeBox.getWeight());

        System.out.println("appleBox1 equals appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("appleBox1 equals orangeBox: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);

        System.out.println("appleBox1 weight after transfer: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight after transfer: " + appleBox2.getWeight());
    }
}

package HW_Seminar_1;

/*
1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
   Перейти по ссылке, реализовать формулу на Java.
*/
import java.util.Scanner;


public class TriangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("number: ");
        int number = sc.nextInt();
        int triangular = number * (number + 1) / 2;
        System.out.println("Треугольное число для " + number + " = " + triangular);
        sc.close();
    }
}

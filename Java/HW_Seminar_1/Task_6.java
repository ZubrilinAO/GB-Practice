package HW_Seminar_1;

/*
Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
 */

import java.util.Scanner;


public class Task_6 {
    public static void main(String[] args) {
        int size = 0, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }

        for (int i = 0; i < size; i += 2) {
            result += arr[i];
        }

        System.out.println("Cумма: " + result);
        System.out.println("Четные элементы, которые суммировались: ");

        for (int i = 0; i < size; i += 2) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}

package HW_Seminar_1;

/**
Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить
*/

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        int operator;
        Double num1, num2, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = sc.nextDouble();

        System.out.println("Введите второе число: ");
        num2 = sc.nextDouble();

        System.out.println("Выберите операцию:\n  1 - сложить\n  2 - умножить");
        operator = sc.nextInt();

        switch (operator) {

            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case 2:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            default:
                System.out.println("Такой операций не существует!");
                break;
        }

        sc.close();
    }
}
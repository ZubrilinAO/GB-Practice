package HW_Seminar_1;

/*
Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
 */

 import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int size = 0;
        boolean flag;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
        }

        for (int i = 0; i < arr.length; i++) {      
            flag = true;                        
            for (int j = 0; j < arr.length; j++) {  
                if(arr[i] == arr[j] && i != j){
                    flag = false;                      
                    break;                             
                }                                      
            } 

            if(flag) System.out.print(arr[i] + " ");
        }  
        sc.close();
    }
}

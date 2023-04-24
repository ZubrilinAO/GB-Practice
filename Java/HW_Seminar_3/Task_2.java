// Задан целочисленный список ArrayList.Найти минимальное,максимальное и среднее арифметическое из этого списка.Collections.max()

package HW_Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_2 {

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static double getAverageValue(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        List<Integer> list = createList(20, 0, 100);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("List: " + list);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + getAverageValue(list));
    }
}

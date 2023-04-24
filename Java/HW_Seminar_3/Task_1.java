// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HW_Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1 {

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }   
        return result;
    }

    static void removeEven(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = createList(20, 0, 100);
        System.out.println(list);
        removeEven(list);
        System.out.println(list);
    }
}

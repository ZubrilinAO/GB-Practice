package HW_Seminar_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createList(15, 0, 100);
        System.out.println(list);
        System.out.println("Sum of all elements: " + sumList(list));
    }

    static LinkedList<Integer> createList(int capacity, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static int sumList(LinkedList<Integer> list) {
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}

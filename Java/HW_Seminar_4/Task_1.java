package HW_Seminar_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createList(10, 0, 100);
        System.out.println(list);
        System.out.println(reverseLinkedList(list));
    }

    static LinkedList<Integer> createList(int capacity, int min, int max) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }
}

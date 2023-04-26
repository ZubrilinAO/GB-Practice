package HW_Seminar_4;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(Integer element) {
        list.addLast(element);
    }

    public Integer dequeue() {
        return list.removeFirst();
    }

    public Integer first() {
        return list.getFirst();
    }
}
package HW_Seminar_4;

public class Task_2 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.first()); // 1
        System.out.println(queue.first()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.first()); // 3
    }

}

package _4_08;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3.2);
        queue.enqueue(2.2);
        queue.enqueue(3.2);
        queue.enqueue(6.3);
        queue.enqueue(3.9);
        queue.enqueue(7.3);
        queue.enqueue(1.1);
        queue.enqueue(6.5);
        queue.enqueue(9.6);

        System.out.println(queue);
        System.out.println(queue.dequeue());
    }
}

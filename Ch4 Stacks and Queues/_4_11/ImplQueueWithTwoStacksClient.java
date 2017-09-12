package _4_11;

public class ImplQueueWithTwoStacksClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(32);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(0);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(10);
        System.out.println(queue.dequeue());
    }
}

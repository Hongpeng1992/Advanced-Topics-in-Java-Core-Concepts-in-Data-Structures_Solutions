package _4_13;

public class PriorityQueueClient {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(new NodeData(3, 1));
        priorityQueue.enqueue(new NodeData(8, 3));
        priorityQueue.enqueue(new NodeData(2, 6));
        priorityQueue.enqueue(new NodeData(4, 6));

        System.out.println(priorityQueue);

        System.out.println("Dequeued element" + priorityQueue.dequeue());
        System.out.println("Queue after dequeue operation: " + priorityQueue);

        priorityQueue.deleteAtTheHead();
        System.out.println("After deletion at the head: " + priorityQueue);

        int jobToDeleteNumber = 3;
        priorityQueue.deleteJob(jobToDeleteNumber);
        System.out.println("After deleting job with jobNumber " + jobToDeleteNumber  + ": " + priorityQueue);
    }
}

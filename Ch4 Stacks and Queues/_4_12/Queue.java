package _4_12;

import java.util.Arrays;

public class Queue {
    private final int MAX_SIZE = 10;
    int head = 0, tail = 0;
    private int[] numbers = new int[MAX_SIZE];

    public boolean isEmpty(){
        return head == tail;
    }

    public void enqueue(int number){
        tail = (tail + 1) % MAX_SIZE; //increment tail circularly
        if(tail == head)
            throw new IllegalStateException("The queue is full");
        numbers[tail] = number;
    }

    public int  dequeue(){
        if(isEmpty())
            throw new IllegalStateException("The queue is empty");
        head = (head + 1) % MAX_SIZE; //increment head circularly
        return numbers[head];
    }

    @Override
    public String toString(){
        return "Head pointer is on index=" + head + ", tail= " + tail + " in " + Arrays.toString(numbers);
    }
}

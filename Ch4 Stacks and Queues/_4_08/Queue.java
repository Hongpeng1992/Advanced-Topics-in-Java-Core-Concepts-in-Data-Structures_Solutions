package _4_08;

import java.util.Arrays;

public class Queue {
    private final int MAX_SIZE = 10;
    int head = 0, tail = 0;
    private double[] numbers = new double[MAX_SIZE];

    public boolean isEmpty(){
        return head == tail;
    }

    public void enqueue(double number){
        tail = (tail + 1) % MAX_SIZE; //increment tail circularly
        if(tail == head)
            throw new IndexOutOfBoundsException("The queue is full");
        numbers[tail] = number;
    }

    public double dequeue(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("The queue is empty");
        head = (head + 1) % MAX_SIZE; //increment head circularly
        return numbers[head];
    }

    @Override
    public String toString(){
        return Arrays.toString(numbers);
    }
}

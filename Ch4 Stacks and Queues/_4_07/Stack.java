package _4_07;

import java.util.Arrays;

public class Stack {
    private final int MAX_SIZE = 10;
    private int top = -1;
    private double[] stack = new double[MAX_SIZE];

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(double number) {
        if (top == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("The stack size is at the maximum, top=" + top);
        }
        top++;
        stack[top] = number;
    }

    public double pop(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("The stack is already empty");
        return stack[top--];
    }

    @Override
    public String toString(){
        return Arrays.toString(stack);
    }
}

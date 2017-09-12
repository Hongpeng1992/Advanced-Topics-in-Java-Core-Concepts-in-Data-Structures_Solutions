package _4_11;

import java.util.Arrays;

public class Stack {
    private final int MAX_SIZE = 10;
    private int top = -1;
    private int[] stack = new int[MAX_SIZE];

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int number) {
        if (top == MAX_SIZE - 1) {
            throw new IllegalStateException("The stack size is at the maximum, top=" + top);
        }
        top++;
        stack[top] = number;
    }

    public int pop(){
        if(isEmpty())
            throw new IllegalStateException("The stack is already empty");
        return stack[top--];
    }

    @Override
    public String toString(){
        return Arrays.toString(stack);
    }
}

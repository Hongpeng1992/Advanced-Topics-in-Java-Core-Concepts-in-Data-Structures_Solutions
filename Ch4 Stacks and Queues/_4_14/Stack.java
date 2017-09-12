package _4_14;

public class Stack {
    private Node top;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int number){
        Node newNode = new Node(number);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(isEmpty())
            throw new IllegalStateException("The stack is empty");
        int hold = top.number;
        top = top.next;
        return hold;
    }

    /**
     * Returns a stack element with out deleting it
     * @return stack element's value
     */
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException("The stack is empty");
        return top.number;
    }

    /**
     * Sorts stack content
     */
    public void sort(){
        if(isEmpty())
            throw new IllegalStateException("The stack is empty");
        Stack auxiliary = new Stack();

        int totalElements = count();
        int poppedFromFirstStack = 0;
        int currentStackElement = 1;
        while(currentStackElement < totalElements) {
            if(currentStackElement < totalElements){
                auxiliary.push(pop());
                poppedFromFirstStack++;
            }
            if (poppedFromFirstStack < totalElements && this.peek() < auxiliary.peek()) {
                //swap stack elements
                int temp = auxiliary.pop();
                auxiliary.push(pop());
                push(temp);
            }
            if(poppedFromFirstStack == totalElements){
                //return all auxiliary stack elements to the base one
                while (poppedFromFirstStack > 0) {
                    push(auxiliary.pop());
                    poppedFromFirstStack--;
                }
                //increment passing stack element
                currentStackElement++;
            }
        }
    }

    private int count(){
        Node curr = top;
        int result = 0;
        while (curr != null){
            result++;
            curr = curr.next;
        }
        return result;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{ ");
        Node curr = top;
        while(curr != null){
            result.append(curr.number + " ");

            curr = curr.next;
        }
        result.append("}");

        return result.toString();
    }
}

class Node{
    int number;
    Node next;

    public Node(int number){
        this.number = number;
    }
}



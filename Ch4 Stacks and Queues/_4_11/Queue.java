package _4_11;

public class Queue {
    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    public void enqueue(int element){
        stack1.push(element);
    }

    public int dequeue(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    @Override
    public String toString(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.toString();
    }
}

package _4_12;

public class Stack {
    private Queue queue1 = new Queue();
    private Queue queue2 = new Queue();


    public void push(int number){
        while(!queue1.isEmpty()){
            queue2.enqueue(queue1.dequeue());
        }
        queue1.enqueue(number);
        while(!queue2.isEmpty()){
            queue1.enqueue(queue2.dequeue());
        }
    }

    public int pop(){
        return queue1.dequeue();
    }

    public String toString(){
        return queue1.toString();
    }
}

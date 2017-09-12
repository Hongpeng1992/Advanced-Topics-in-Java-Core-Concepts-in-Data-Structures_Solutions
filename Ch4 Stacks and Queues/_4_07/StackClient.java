package _4_07;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2.0);
        stack.push(4.8);
        stack.push(0.1);
        stack.push(1.5);
        stack.push(3.1);
        stack.push(6.2);
        stack.push(3.4);
        stack.push(2.1);
        stack.push(8.3);
        stack.push(8.3);

        System.out.println(stack);
        System.out.println(stack.pop());
    }
}

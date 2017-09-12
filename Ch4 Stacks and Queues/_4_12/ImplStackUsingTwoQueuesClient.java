package _4_12;

public class ImplStackUsingTwoQueuesClient {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);

        stack.pop();
        System.out.println(stack.pop());

        stack.push(43);
        System.out.println(stack);
    }
}

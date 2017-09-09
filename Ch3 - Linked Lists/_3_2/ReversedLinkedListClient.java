package _3_2;

public class ReversedLinkedListClient {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(new NodeData(32));
        linkedList.addHead(new NodeData(0));
        linkedList.addHead(new NodeData(-9));
        linkedList.addHead(new NodeData(6));
        linkedList.addHead(new NodeData(190));

        System.out.println("Original linked list: " + linkedList);

        System.out.println("Reversed linked list: " + linkedList.getReversedLinkedList());
    }
}

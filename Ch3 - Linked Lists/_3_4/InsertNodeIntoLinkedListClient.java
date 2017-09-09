package _3_4;

public class InsertNodeIntoLinkedListClient {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(new NodeData(32));
        linkedList.addHead(new NodeData(0));
        linkedList.addHead(new NodeData(-9));
        linkedList.addHead(new NodeData(6));
        linkedList.addHead(new NodeData(190));

        System.out.println("Original linked list: " + linkedList);

        linkedList.insert(2, 3);
        System.out.println("Inserted 2 after the 3rd element: " + linkedList);

        linkedList.insert(2, 0);
        System.out.println("Inserted 2 at the head: " + linkedList);

        linkedList.insert(2, linkedList.length() + 1);
        System.out.println("Inserted 2 at the tail: " + linkedList);
    }
}

package _3_3;

public class SortingLinkedListClient {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(new NodeData(32));
        linkedList.addHead(new NodeData(0));
        linkedList.addHead(new NodeData(-9));
        linkedList.addHead(new NodeData(3));
        linkedList.addHead(new NodeData(19));

        System.out.println("Original linked list: " + linkedList);

        linkedList.sortLinkedList();
        System.out.println("After sorting: " + linkedList);
    }
}

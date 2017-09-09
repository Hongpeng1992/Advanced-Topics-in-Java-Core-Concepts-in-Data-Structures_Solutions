package _3_12;

public class TwoDigitsSumClient {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addHead(new NodeData(2));
        linkedList1.addHead(new NodeData(8));
        linkedList1.addHead(new NodeData(9));
        linkedList1.addHead(new NodeData(5));
        linkedList1.addHead(new NodeData(5));
        linkedList1.addHead(new NodeData(1));
        linkedList1.addHead(new NodeData(9));
        linkedList1.addHead(new NodeData(6));

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addHead(new NodeData(3));
        linkedList2.addHead(new NodeData(1));
        linkedList2.addHead(new NodeData(2));
        linkedList2.addHead(new NodeData(4));

        System.out.println(linkedList1);
        System.out.println(linkedList2);

        System.out.println(linkedList1.addDigit(linkedList2));
    }
}

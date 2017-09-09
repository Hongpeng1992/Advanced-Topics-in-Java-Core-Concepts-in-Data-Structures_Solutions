package _3_6;

public class LinkedList {
    Node head = null;

    public void addHead(NodeData nodeData){
        Node node = new Node(nodeData);
        node.next = head;
        head = node;
    }

    public void addTail(NodeData nodeData){
        Node curr = head;
        Node prev = null;
        if(curr == null) {
            addHead(nodeData);
            return;
        }
        while (curr != null) {
            prev = curr;
            curr = curr.next;
        }
        Node newNode = new Node(nodeData);
        prev.next = newNode;
    }

    /**
     * Stores binary format of the given parameter in the linked list
     * @param number to be converted to binary format
     */
    public void setBinaryLinkedList(int number){
        head = null;
        Node curr = head;
        do{
            int bitToStore = number % 2;
            number /= 2;
            addTail(new NodeData(bitToStore));
        }while(number > 0);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node curr = head;
        while(curr != null){
            stringBuilder.append(curr.dataData).append(" ");
            curr = curr.next;
        }
        return stringBuilder.toString();
    }
}

class Node{
    NodeData dataData;
    Node next;

    Node(NodeData nodeData){
        dataData = nodeData;
        this.next = null;
    }
}

class NodeData{
    int data;

    public NodeData(int data) {
        this.data = data;
    }

    public int compareTo(NodeData another){
        if(this.data == another.data)
            return 0;
        else if(this.data > another.data)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString(){
        return data + "";
    }
}

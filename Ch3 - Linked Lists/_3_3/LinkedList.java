package _3_3;

public class LinkedList {
    private Node head = null;

    public void addHead(NodeData nodeData){
        Node node = new Node(nodeData);
        node.next = head;
        head = node;
    }

    /**sorts linked list in ascending order by creating a new one, extracting a node with the largest values
     * and adding it at the head of the resulting linked list
     * @throws IllegalStateException if the method was called on an empty linked list
     */
    public void sortLinkedList(){
        if(head == null){
            throw new IllegalStateException("Linked list is empty.");
        }

        LinkedList resultLinkedList = new LinkedList();
        do{
            resultLinkedList.addHead(extractNodeWithLargestValue().nodeData);
        }while(head != null);
        this.head = resultLinkedList.head;
    }

    /**
     * Finds and deletes a node with the largest value
     * @return Node with the largest value; returns null is there is no elements
     * @throws IllegalStateException  if the method was called on an empty linked list
     */
    private Node extractNodeWithLargestValue(){
        //if there is only one node - need to return it and delete it from the linked list
        if(head == null){
            throw new IllegalStateException("Linked list is empty");
        }
        if(head.next == null){
            Node tmp = head;
            head = null;
            return tmp;
        }

        Node prevToLargestValue = null;
        Node largestValueNode = head;
        Node curr = head;
        Node prev = null;

        while(curr != null){
            if(curr.nodeData.compareTo(largestValueNode.nodeData) > 0){
                largestValueNode = curr;
                prevToLargestValue = prev;
            }
            prev = curr;
            curr = curr.next;
        }

        if(largestValueNode == head)
            head = largestValueNode.next;
        else
            prevToLargestValue.next = largestValueNode.next;
        return largestValueNode;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node curr = head;
        while(curr != null){
            stringBuilder.append(curr.nodeData + " ");
            curr = curr.next;
        }
        return stringBuilder.toString();
    }
}

class Node{
    NodeData nodeData;
    Node next;

    Node(NodeData nodeData){
        this.nodeData = nodeData;
        this.next = null;
    }

    @Override
    public String toString(){
        return "[nodeData=" + nodeData.toString() + ", next=" + next + "]";
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

package _3_7;

import java.util.NoSuchElementException;

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
     * sets linked list to binary format of the given parameter
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


    /**
     * returns decimal representation of the binary store in this linked list
     */
    public int getDecimalRepresentation(){
        if(head == null)
            throw new NoSuchElementException("The linked list is empty.");
        Node curr = head;

        int decimal = 0;
        int powerCount = 0;
        int multiplier;
        while(curr != null){
            multiplier = (int) Math.pow(2, powerCount);
            decimal += curr.dataData.data * multiplier;

            powerCount++;
            curr = curr.next;
        }
        return decimal;
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

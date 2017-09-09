package _3_12;

import sun.awt.image.ImageWatched;

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
     * adds
     * @param digitLinkedList
     * @return
     */
    public LinkedList addDigit(LinkedList digitLinkedList){
        LinkedList result = new LinkedList();

        Node curr1 = head;
        Node curr2 = digitLinkedList.head;
        int remainderFromPreviousSum = 0;
        while(curr1 != null && curr2 != null){
            int currSum = curr1.dataData.data + curr2.dataData.data + remainderFromPreviousSum;
            remainderFromPreviousSum = 0;
            int lastDigit = 0;
            if(currSum < 10)
                lastDigit = currSum;
            else if(currSum > 10) {
                remainderFromPreviousSum = firstDigit(currSum);
                lastDigit = currSum % 10;
            }
            else{
                lastDigit = 0;
                remainderFromPreviousSum = 1;
            }

            result.addTail(new NodeData(lastDigit));
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        Node remainingPart = curr1 == null ? curr2 : curr1;
        while(remainingPart != null){
            int currSum = remainingPart.dataData.data + remainderFromPreviousSum;
            remainderFromPreviousSum = 0;
            int lastDigit = 0;
            if(currSum < 10)
                lastDigit = currSum;
            else if(currSum > 10) {
                remainderFromPreviousSum = firstDigit(currSum);
                lastDigit = currSum % 10;
            }

            result.addTail(new NodeData(lastDigit));
            remainingPart = remainingPart.next;
        }
        return result;
    }

    private int firstDigit(int number){
        while(number > 9) number /= 10;
        return Math.abs(number);
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

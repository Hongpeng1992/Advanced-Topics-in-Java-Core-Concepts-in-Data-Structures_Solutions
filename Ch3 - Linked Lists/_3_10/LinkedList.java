package _3_10;

import java.util.NoSuchElementException;

public class LinkedList {
    Node head = null;

    public LinkedList(char[] chars){
        for(char ch : chars){
            addTail(new NodeData(ch));
        }
    }

    /**
     * Makes deep copy of the linked list
     * @param linked list to be made a deep copy of
     */
    public LinkedList(LinkedList linkedList){
        head = null;
        Node curr = linkedList.head;
        while(curr != null){
            addTail(curr.dataData);
            curr = curr.next;
        }
    }

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

    public void deleteOnMatch(NodeData nodeData){
        if(head == null){
            throw new NoSuchElementException("Called on empty linked list");
        }
        Node curr = head;
        Node prev = null;
        while (curr != null){
            if(curr.dataData.compareTo(nodeData) == 0){
                if(curr == head)
                {
                    head = head.next;
                }
                else {
                    prev.next = curr.next;
                }
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    /**
     * returns whether this linked list is the anagram to the passed one
     * @param linked list to be tested against; the content if preserved by make a deep copy of it;
     */
    public boolean isAnagram(LinkedList linkedList){
        if(head == null){
            return false;
        }
        if(linkedList.head == null)
            return false;

        LinkedList linkedListToCompareAgainst = new LinkedList(linkedList);
        Node curr = head;
        while(curr != null){
            NodeData nodeToDelete = curr.dataData;
            linkedListToCompareAgainst.deleteOnMatch(nodeToDelete);
            curr = curr.next;
        }
        return linkedListToCompareAgainst.isEmpty();
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
    char data;

    public NodeData(char data) {
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

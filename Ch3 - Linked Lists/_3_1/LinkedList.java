package _3_1;

public class LinkedList {
    Node head = null;

    public void addHead(NodeData nodeData){
        Node node = new Node(nodeData);
        node.next = head;
        head = node;
    }

    public boolean isSortedInAscendingOrder(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            if(prev != null && curr.dataData.compareTo(prev.dataData) < 0)
                return false;
            prev = curr;
            curr = curr.next;
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node curr = head;
        while(curr != null){
            stringBuilder.append(curr.dataData + " ");
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

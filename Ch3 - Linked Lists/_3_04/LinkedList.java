package _3_04;

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
        while (curr != null) {
            prev = curr;
            curr = curr.next;
        }
        Node newNode = new Node(nodeData);
        prev.next = newNode;
    }

    /**
     * Inserts integer after the specified element
     * @param n node value to pass to the inserted node
     * @param j specifies position of node after which the new node is to be inserted
     */
    public void insert(int n, int j){
        if(j == 0)
            addHead(new NodeData(n));
        if(j > length())
            addTail(new NodeData(n));

        Node curr = head;

        //j == 0 is already covered above
        Node prev = curr;
        curr = curr.next;
        int count = 1;
        while(curr != null) {

            if(count == j)
            {
                Node newNode = new Node(new NodeData(n));
                prev.next = newNode;
                newNode.next = curr;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
    }

    public int length(){
        Node curr = head;
        int countOfNodes = 0;
        while(curr != null){
            countOfNodes++;
            curr = curr.next;
        }
        return countOfNodes;
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

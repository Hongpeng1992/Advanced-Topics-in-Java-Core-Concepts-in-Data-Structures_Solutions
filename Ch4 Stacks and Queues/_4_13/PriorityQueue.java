package _4_13;

public class PriorityQueue {
    private final int MAX_SIZE = 10;
    private Node head, tail;

    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Enqueues element to priority queue based on the priority number given in parameter
     * @param nodeData data stored at the particular node
     */
    public void enqueue(NodeData nodeData){
        Node node = new Node(nodeData);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else {
            Node curr = head;
            Node prev = null;
            while (curr != null) {
                if (node.compareTo(curr) > 0) {
                    if(curr == head){
                        node.setNext(head);
                        head = node;
                        break;
                    }
                    else{
                        prev.setNext(node);
                        node.setNext(curr);
                    }
                }
                else if(curr == head){
                    node.setNext(head.getNext());
                    head.setNext(node);
                    break;
                }
                curr = curr.getNext();
                prev = prev.getNext();
            }
        }
    }

    /**
     * Dequeues element from prioroty queue
     * @return node's data representing particular node deleted from prioroty queue
     */
    public NodeData dequeue(){
        if(isEmpty())
            throw new IllegalStateException("The Queue is empty");
        NodeData nodeData = head.getNodeData();
        head = head.getNext();
        if(head == null)
            tail = null;
        return nodeData;
    }

    /**
     * Deletes node at the head
     */
    public void deleteAtTheHead(){
        head = head.getNext();
    }

    /**
     * Deletes node which jobNumber equals to the one passed
     * @param jobNumber which used to find the first node that has the same jobNumber and deletes it
     */
    public void deleteJob(int jobNumber){
        if(head.getNodeData().getJobNumber() == jobNumber){
            deleteAtTheHead();
        }
        else{
            Node curr = head.getNext();
            Node prev = head;

            while(curr != null){
                if(curr.getNodeData().getJobNumber() == jobNumber)
                {
                    prev.setNext(curr.getNext());
                }
                curr = curr.getNext();
                prev = prev.getNext();
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node curr = head;
        result.append("{ ");
        while(curr != null){
            result.append(curr + " ");
            curr = curr.getNext();
        }
        result.append(" }");
        return result.toString();
    }
}

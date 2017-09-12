package _4_13;

public class Node implements Comparable<Node>{
    private NodeData nodeData;
    private Node next;

    public Node(NodeData nodeData){
        this.nodeData = nodeData;
    }

    public NodeData getNodeData() {
        return nodeData;
    }

    public void setNodeData(NodeData nodeData) {
        this.nodeData = nodeData;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return "{ nodeData=" + nodeData.toString() + " }";
    }

    @Override
    public int compareTo(Node o) {
        if(this.nodeData.getPriorityNumber() > o.nodeData.getPriorityNumber())
            return 1;
        else if(this.nodeData.getPriorityNumber() < nodeData.getPriorityNumber())
            return - 1;
        else
            return 0;
    }
}

class NodeData{
    private int jobNumber;
    private int priorityNumber;

    public NodeData(int jobNumber, int priorityNumber) {
        this.jobNumber = jobNumber;
        this.priorityNumber = priorityNumber;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    @Override
    public String toString(){
        return "{ jobNumber=" + jobNumber + ", priorityNumber=" + priorityNumber + "}";
    }
}

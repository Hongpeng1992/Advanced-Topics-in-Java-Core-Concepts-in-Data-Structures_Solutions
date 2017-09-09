package _3_1;

/**
 * Created by DmytroW on 06.09.2017.
 */
public class CheckLinkedListAscendancy {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(new NodeData(24));
        linkedList.addHead(new NodeData(24));
        linkedList.addHead(new NodeData(20));
        linkedList.addHead(new NodeData(2));

        System.out.println(linkedList.isSortedInAscendingOrder());
        System.out.println(linkedList);
    }
}

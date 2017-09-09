package _3_07;

public class DecimalFromBinaryWithMostSignificantBitsAtEndClient {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        int number = 13;
        linkedList.setBinaryLinkedList(number);

        System.out.println("Binary representation of " + number + " is: " + linkedList);

        System.out.println("Converted back to decimal: " + linkedList.getDecimalRepresentation());
    }
}

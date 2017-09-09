package _3_10;

public class AnagramTestClient {
    public static void main(String[] args) {
        char[] word1 = "treason".toCharArray();
        char[] word2 = "senator".toCharArray();

        LinkedList linkedList1 = new LinkedList(word1);
        LinkedList linkedList2 = new LinkedList(word2);

        System.out.println(linkedList1);
        System.out.println(linkedList2 );

        System.out.println(linkedList1.isAnagram(linkedList2));

        System.out.println(linkedList1);
        System.out.println(linkedList2 );
    }
}

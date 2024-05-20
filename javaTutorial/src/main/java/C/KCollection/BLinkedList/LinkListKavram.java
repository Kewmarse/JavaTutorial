package C.KCollection.BLinkedList;

import java.util.LinkedList;

public class LinkListKavram {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.set(0,15);

        System.out.println(linkedList);

    }
}

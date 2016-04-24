package LinkedLists;

/**
 * Created by captaincode on 24/04/16.
 */
public class TestLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int i=0; i<5; i++)
            linkedList.add(i);

        linkedList.print();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(0));
        linkedList.remove(0);
        linkedList.print();
        System.out.printf(linkedList.toString());
    }
}

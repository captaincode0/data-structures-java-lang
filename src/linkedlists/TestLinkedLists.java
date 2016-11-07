package linkedlists;

/**
 *	   _____            _        _                     _
 *	  / ____|          | |      (_)                   | |
 *	 | |     __ _ _ __ | |_ __ _ _ _ __   ___ ___   __| | ___
 *	 | |    / _` | '_ \| __/ _` | | '_ \ / __/ _ \ / _` |/ _ \
 *	 | |___| (_| | |_) | || (_| | | | | | (_| (_) | (_| |  __/
 *	  \_____\__,_| .__/ \__\__,_|_|_| |_|\___\___/ \__,_|\___|
 *	             | |
 *	             |_|
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

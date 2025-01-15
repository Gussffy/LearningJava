package gustavo.com.list;

import java.util.Scanner;

public class MainListTest {
    public static void main(String[] args) {

        testAddFirst();

        testAddLast();

        testRemoveByValue();

        testRemoveFirst();

        testReverseList();

        testGetsize();

    }

    private static void testAddFirst() {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();

        list.addFirst(sc.nextLine());
        list.addFirst(sc.nextLine());
        list.addFirst(sc.nextLine());
        list.addFirst(sc.nextLine());

        System.out.println ( "Test AddFirst: ");
        list.printList();

    }
    private static void testAddLast() {
        LinkedList<String> list = new LinkedList<>();

        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");

        System.out.println(("Test AddLast Expected A B C D"));
        list.printList();

    }
    private static void testRemoveByValue() {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");

        list.removeByValue("C");
        System.out.println("Test RemoveByValue Expected D B A");
        list.printList();
    }
    private static void testRemoveFirst() {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");

        list.removeFirst();
        System.out.println(("Test RemoveFirst Expected C B A"));
        list.printList();

    }
    private static void testReverseList() {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");

        list.reverseList();
        System.out.println(("Test ReverseList Expected A B C D"));
        list.printList();

    }

    private static void testGetsize() {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");

        list.getSize();
        System.out.println(("GetSize: "+ list.getSize()));
        System.out.println("Test getSize Expected: 3 ");

    }
}

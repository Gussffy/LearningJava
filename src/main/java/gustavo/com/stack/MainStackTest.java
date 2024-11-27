package gustavo.com.stack;

import gustavo.com.list.LinkedList;

public class MainStackTest {
    public static void main(String[] args) {

        testPush();

        testPop();

        testPeek();

        testIsEmpty();

        testGetSize();

    }

    private static void testPush() {

        StackImpl<String> stack = new StackImpl<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println("Test expected: 4 3 2 1");
        stack.printStack();

    }
    private static void testPop() {
        StackImpl<String> stack = new StackImpl<>();

        stack.push("Gustavo");
        stack.push("Ilaelton");
        stack.push("Larissa");
        stack.push("Juliana");
        stack.push("Edcássio");
        stack.push("Gabriel");

        stack.pop ();
        System.out.println("Test expected: Edcássio Juliana Larissa Ilaelton Gustavo ");
        stack.printStack();
    }
    private static void testPeek() {
        StackImpl<String> stack = new StackImpl<>();

        stack.push("Gustavo");
        stack.push("Ilaelton");
        stack.push("Larissa");
        stack.push("Juliana");
        stack.push("Edcássio");
        stack.push("Gabriel");

        stack.peek();
        System.out.println("Test expected: Gabriel");
        System.out.println("Peeked: " + stack.peek());

    }
    private static void testIsEmpty() {
        StackImpl<String> stack = new StackImpl<>();

        stack.push("Gustavo");

        stack.isEmpty();
        System.out.println("Test expected: false");
        System.out.println("Is Empty? " + stack.isEmpty());

        stack.pop();
        System.out.println("Test expected: true");
        System.out.println("Is Empty? " + stack.isEmpty());

    }
    private static void testGetSize() {

        StackImpl<String> stack = new StackImpl<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        stack.getSize();
        System.out.println("Test expected: 4");
        System.out.println("Test GetSize: " + stack.getSize());

        stack.pop();
        System.out.println("Test expected: 3");
        System.out.println("Test GetSize: " + stack.getSize());

    }
}

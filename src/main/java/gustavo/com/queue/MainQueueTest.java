package gustavo.com.queue;

public class MainQueueTest {
    public static void main(String[] args) {

        testEnqueue();

        testDequeue();

        testPeek();

        testIsEmpty();

        testGetSize();

    }

    private static void testEnqueue() {
        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        System.out.println("Test Enqueue, Expected: 1 2 3 4");
        queue.printQueue();

    }
    private static void testDequeue() {

        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        queue.dequeue();
        System.out.println("Test Dequeue, Expected: 2 3 4");
        queue.printQueue();

    }
    private static void testPeek() {

        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        queue.peek();

        System.out.println("Test Peek, Expected: 1");
        String first = queue.peek();
        System.out.println("Peeked: " + first);

    }
    private static void testIsEmpty() {

        QueueImpl<String> queue = new QueueImpl<>();

        boolean IsEmpty = queue.isEmpty();
        System.out.println("Is Empty: " + IsEmpty);
        System.out.println("Test IsEmpty, Expected: true");

        queue.enqueue("1");
        boolean IsEmpty2 = queue.isEmpty();
        System.out.println("Is Empty: " + IsEmpty2);
        System.out.println("Test IsEmpty, Expected: false");

    }
    private static void testGetSize() {
        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");

        int size = queue.getsize();
        System.out.println("GetSize: " + size);
        System.out.println("Test GetSize, Expected: 5");

    }

}

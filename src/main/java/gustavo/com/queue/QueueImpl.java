package gustavo.com.queue;

import gustavo.com.list.LinkedList;
import gustavo.com.list.Node;
import org.w3c.dom.CDATASection;

public class QueueImpl <T extends Comparable <T>> implements Queue <T> {

    LinkedList<T> queue = new LinkedList<>();
    @Override
    public void enqueue(T data) {
        this.queue.addLast(data);
    }

    @Override
    public void dequeue() {
        this.queue.removeByValue(this.peek());
    }

    @Override
    public T peek() {
        return this.queue.getFirst().getValue();
    }

    @Override
    public boolean isEmpty() {
        return this.getsize() == 0;
    }

    @Override
    public int getsize() {
        return this.queue.getSize();
    }

    @Override
    public void printQueue() {
        this.queue.printList();
    }

    }


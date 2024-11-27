package gustavo.com.queue;

public interface Queue <T extends Comparable <T>> {

     void enqueue(T data);

     void dequeue();

     T peek();

     boolean isEmpty();

     int getsize();

     void printQueue();
}

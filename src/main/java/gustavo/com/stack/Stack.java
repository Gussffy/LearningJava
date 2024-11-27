package gustavo.com.stack;

public interface Stack <T extends Comparable<T>> {

    void push(T data);

    void pop();

    T peek();

    Boolean isEmpty();

    int getSize();

    void printStack();
}

package gustavo.com.stack;

import gustavo.com.list.LinkedList;
import gustavo.com.list.Node;

public class StackImpl <T extends Comparable<T>> implements Stack<T> {

    LinkedList <T> stack = new LinkedList <>();


    @Override
    public void push(T data) {
        this.stack.addFirst(data);
    }

    @Override
    public void pop() {
        this.stack.removeByValue(this.peek());
    }

    @Override
    public T peek() {
        return this.stack.getFirst().getValue();
    }

    @Override
    public Boolean isEmpty() {
        return this.stack.getSize() == 0;
    }
    @Override
    public int getSize() {
        return this.stack.getSize();
    }
    @Override
    public void printStack() {
        Node temp = this.stack.first;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}

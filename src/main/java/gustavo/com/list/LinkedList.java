package gustavo.com.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {


    public Node<T> first = null;
    public Node<T> last = null;
    public int size = 0;

    public LinkedList() {
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public void addFirst (T value){

        Node<T> newNode = new Node<>(value);
        if(first == null & last == null){
            this.first= newNode;
            this.last = newNode;
        }else{
            newNode.setNextNode(this.first);
            this.first = newNode;
        }
        size++;
    }
    public void addLast (T value){

        Node<T> newNode = new Node<>(value);
        if(first == null & last == null){
            this.last = newNode;
            this.first = newNode;
        }else{
            this.last.setNextNode(newNode);
            this.last = newNode;
        }
        size++;
    }

    public void removeByValue (T value){

        Node<T> before = null;
        Node<T> current = this.first;
        for (int i = 0; i < size; i++) {
            if(current.getValue().equals(value)){
                if (current == this.first && current == this.last){
                    this.first = null;
                    this.last = null;
                } else if (current == this.first) {
                    this.first = current.getNextNode();
                    current = null;
                } else if (current == this.last) {
                    this.last = before;
                    before.setNextNode(null);
                } else {
                    before.setNextNode(current.getNextNode());
                    current = null;
                }
                this.size--;
                break;
            }
            before = current;
            current = current.getNextNode();
        }
    }

    public void removeFirst () {
        if(first == null){
            throw new NoSuchElementException("A lista está vazia");
        }
        if (this.first == this.last){
            this.first = null;
            this.last = null;
        } else {
            Node<T> temp = this.first;
            this.first = this.first.getNextNode();
            temp.setNextNode(null);
        }
        this.size--;
    }
    public Node<T> getNode (int position){
        Node<T> current = this.first;
        for (int i = 0; i < position; i++) {
            if (current.getNextNode() != null){
                current = current.getNextNode();
            }
        }
        return current;
    }
    public Node<T> getNodeByValue (T value){
        Node<T> current = this.first;
        for (int i = 0; i < this.size; i++) {
            if(current.getValue().equals(value)){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = current.getValue();
                current = current.getNextNode();
                return value;
            }
        };
    }
    public void reverseList () {
        Node<T> prev = null;
        Node<T> current = this.first;
        Node<T> next;
        this.first = current;

        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;
        }
        this.first = prev;
    }
    public void printList (){
        Node temp = this.first;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }
}

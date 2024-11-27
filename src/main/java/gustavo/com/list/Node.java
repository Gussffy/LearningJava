package gustavo.com.list;

public class Node<T> implements Comparable<Node<T>> {

    public T value;
    public Node<T> nextNode;

    public Node(T value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public int compareTo(Node node) {
        if (this.value.equals(node.value)) return 0;
        return 1;

    }
}

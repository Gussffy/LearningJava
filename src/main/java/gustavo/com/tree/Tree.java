package gustavo.com.tree;

public class Tree <T extends Comparable<T>> {

    private Node<T> root;

    public Tree() {
        root = null;
    }
    public Node<T> getRoot() {
        return this.root;
    }

    public void addElement(T value) {
        Node<T> newNode = new Node<>(value);

        if (this.root == null) {
            this.root = newNode;
        }else{
            Node<T> current = this.root;
            while (true) {
                if (newNode.getValue().compareTo(current.getValue()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    }else{
                        current.setLeft(newNode);
                        break;
                    }
                }else{
                    if (current.getRight() != null) {
                        current = current.getRight();
                    }else{
                        current.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

    public void showInOrder(Node<T> current) {
        if (current != null) {
            showInOrder(current.getLeft());
            System.out.println(current.getValue());
            showInOrder(current.getRight());
        }
    }

    public void showInPreOrder(Node<T> current) {
        if (current != null) {
            System.out.println(current.getValue());
            showInPreOrder(current.getLeft());
            showInPreOrder(current.getRight());
        }
    }

    public void showInPostOrder(Node<T> current) {
        if (current != null) {
            showInPostOrder(current.getLeft());
            showInPostOrder(current.getRight());
            System.out.println(current.getValue());
        }
    }

    public boolean removeElement (T value) {
        Node<T> current = this.root;
        Node<T> currentFather = null;

        while (current != null) {
            if (current.getValue().equals(value)) {

                privateRemove(current, currentFather);
                break;
            } else if (value.compareTo(current.getValue()) < 0) {
                currentFather = current;
                current = current.getLeft();
            } else {
                currentFather = current;
                current = current.getRight();
            }
        }
        return current != null;
    }

    private void privateRemove(Node<T> current, Node<T> currentFather) {
        if(current.getRight() != null) {

            Node<T> sub = current.getRight();
            Node<T> subFather = current;
            Node<T> saveTree = null;

            if (current.getValue().equals(this.root.getValue())) {
                saveTree = sub;
            }

            while (sub.getLeft() != null) {
                subFather = sub;
                sub = sub.getLeft();
            }

            sub.setLeft(current.getLeft());

            if (currentFather != null) {
                if (current.getValue().compareTo(currentFather.getValue()) < 0) {
                    currentFather.setLeft(sub);
                } else {
                    currentFather.setRight(sub);
                }
            } else {
                this.root = sub;
                sub.setRight(saveTree);
            }

            if (sub.getValue().compareTo(subFather.getValue()) < 0) {
                subFather.setLeft(null);
            }
        } else if (current.getLeft() != null) {

            Node<T> sub = current.getLeft();
            Node<T> subFather = current;

            while (sub.getRight() != null) {
                subFather = sub;
                sub = sub.getRight();
            }

            sub.setRight(current.getRight());

            if (currentFather != null) {
                if (current.getValue().compareTo(currentFather.getValue()) < 0) {
                    currentFather.setLeft(sub);
                } else {
                    currentFather.setRight(sub);
                }
            } else{
                this.root = sub;
            }

            if(sub.getValue().compareTo(subFather.getValue()) < 0) {
                subFather.setLeft(null);
            } else {
                subFather.setRight(null);
            }
        }
        else {
            if (currentFather != null) {
                if (current.getValue().compareTo(currentFather.getValue()) < 0) {
                    currentFather.setLeft(null);
                } else {
                    currentFather.setRight(null);
                }
            } else {
                this.root = null;
            }
        }
    }
}

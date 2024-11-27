package gustavo.com.tree;

public class MainTreeTest {
    public static void main(String[] args) {

        testAddElement();
        testRemoveElement();
    }

    private static void testAddElement() {

        Tree<Integer> tree = new Tree<>();


    }
    private static void testRemoveElement() {

        Tree<Integer> tree = new Tree<>();

        tree.addElement(30);
        tree.addElement(40);
        tree.addElement(20);

        tree.showInOrder(tree.getRoot());
        tree.removeElement(20);
        tree.showInPostOrder(tree.getRoot());

    }


}

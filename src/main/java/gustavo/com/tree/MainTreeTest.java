package gustavo.com.tree;

public class MainTreeTest {

    public static void main(String[] args) {
        // Testando a adição de elementos
        testAddElement();

        // Testando a remoção de elementos
        testRemoveElement();

        // Testando a exibição in-order
        testShowInOrder();

        // Testando a exibição pre-order
        testShowInPreOrder();

        // Testando a exibição post-order
        testShowInPostOrder();
    }

    private static void testAddElement() {
        Tree<Integer> tree = new Tree<>();
        tree.addElement(5);
        tree.addElement(3);
        tree.addElement(7);
        tree.addElement(2);
        tree.addElement(4);

        System.out.println(" Adicionado elementos na Árvore.");
    }

    private static void testRemoveElement() {
        Tree<Integer> tree = new Tree<>();
        tree.addElement(5);
        tree.addElement(3);
        tree.addElement(7);
        tree.addElement(2);
        tree.addElement(4);

        boolean removed = tree.removeElement(3);
        System.out.println(" Remover o elemento 3: " + removed);

        removed = tree.removeElement(10);
        System.out.println(" Tentativa de remover o elemento 10: " + removed);
    }

    private static void testShowInOrder() {
        Tree<Integer> tree = new Tree<>();
        tree.addElement(5);
        tree.addElement(3);
        tree.addElement(7);
        tree.addElement(2);
        tree.addElement(4);

        System.out.println(" In-Order:");
        tree.showInOrder(tree.getRoot());
    }

    private static void testShowInPreOrder() {
        Tree<Integer> tree = new Tree<>();
        tree.addElement(5);
        tree.addElement(3);
        tree.addElement(7);
        tree.addElement(2);
        tree.addElement(4);

        System.out.println(" Pre-Order:");
        tree.showInPreOrder(tree.getRoot());
    }

    private static void testShowInPostOrder() {
        Tree<Integer> tree = new Tree<>();
        tree.addElement(5);
        tree.addElement(3);
        tree.addElement(7);
        tree.addElement(2);
        tree.addElement(4);

        System.out.println(" Post-Order:");
        tree.showInPostOrder(tree.getRoot());
    }
}

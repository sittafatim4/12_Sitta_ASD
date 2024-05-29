public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);
        bta.add(10);
        bta.add(15);

        System.out.print("\nInOrder Traversal: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("\nPreOrder Traversal: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("\nPostOrder Traversal: ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}

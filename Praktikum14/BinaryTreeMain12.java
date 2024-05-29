public class BinaryTreeMain12 {
    public static void main(String[] args) {
        BinaryTree12 bt = new BinaryTree12();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node 5: " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node 5: " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        int minValue = bt.findMin();
        int maxValue = bt.findMax();

        System.out.println("Minimum value in the tree: " + bt.findMin());
        System.out.println("Maximum value in the tree: " + bt.findMax());

        System.out.println("Leaf nodes:");
        bt.printLeafNodes();

        int leafCount = bt.countLeafNodes();
        System.out.println("Number of leaf nodes: " + leafCount);

    }
}

class Node12 {
    int data;
    Node12 left, right;

    public Node12(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree12 {
    Node12 root;

    public BinaryTree12() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // tree is empty
            root = new Node12(data);
        } else {
            Node12 current = root;
            Node12 parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new Node12(data);
                        break;
                    }
                } else if (data > current.data) {
                    current = current.right;
                    if (current == null) {
                        parent.right = new Node12(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node12 current = root;
        while (current != null) {
            if (data == current.data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node12 node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    void traverseInOrder(Node12 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node12 getSuccessor(Node12 del) {
        Node12 successor = del.right;
        Node12 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node12 parent = root;
        Node12 current = root;
        boolean isLeftChild = true;
        while (current != null) {
            if (data == current.data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }

        // Deletion
        if (current.left == null && current.right == null) { // No child
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) { // One right child
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) { // One left child
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else { // Two children
            Node12 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }

    void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    private Node12 addRecursive(Node12 current, int data) {
        if (current == null) {
            return new Node12(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    int findMin() {
        if (root == null) {
            System.out.println("Tree is empty!");
            return Integer.MIN_VALUE;
        }

        Node12 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    int findMax() {
        if (root == null) {
            System.out.println("Tree is empty!");
            return Integer.MAX_VALUE;
        }

        Node12 current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    void printLeafNodes() {
        if (root == null) {
            System.out.println("Tree is empty!");
            return;
        }
        System.out.println("Leaf nodes:");
        printLeafNodes(root);
    }

    private void printLeafNodes(Node12 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    int countLeafNodes() {
        if (root == null) {
            return 0;
        }
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node12 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
}
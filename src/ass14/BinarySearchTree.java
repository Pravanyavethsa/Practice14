package ass14;

class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
class BinarySearchTree {
    Node root;
    int key;

    BinarySearchTree() {
        root = null;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }

    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        else
            return search(root.left, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        int key = 6;
        if (tree.search(tree.root, key) == null)
            System.out.println(key + ":not found");
        else
            System.out.println(key + ":found");

         key = 60;
        if (tree.search(tree.root, key) == null)
            System.out.println(key+ ":not found");
        else
            System.out.println(key + ":found");
    }
}

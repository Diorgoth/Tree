package uz.pdpDS;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(50);

        tree.traversalPreOrder();
        System.out.println("$$$$$$$$");
        tree.traversalInOrder();
        System.out.println("$$$$$$$$");
        tree.traversalPostOrder();
    }
}

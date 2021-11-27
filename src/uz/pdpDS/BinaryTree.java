package uz.pdpDS;

public class BinaryTree {



    public class Node{
        private int value;
        private Node leftchild;
        private Node rightchild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int item){
        if (root==null) {
            root = new Node(item);
            return;
        }

        var current = root;
        while (true){
            if (item> current.value ){
                if (current.rightchild == null){
                    current.rightchild = new Node(item);
                    break;
                }
                current = current.rightchild;
            }else {
                if (current.leftchild == null){
                    current.leftchild = new Node(item);
                    break;
                }
                current = current.leftchild;
            }
        }

    }

    public void traversalPreOrder(){
        traversalPreOrder(root);
    }
    public void traversalPreOrder(Node root){
        if (root == null) return;;

        System.out.println(root.value);
        traversalPreOrder(root.leftchild);
        traversalPreOrder(root.rightchild);
    }

    public void traversalInOrder(){
        traversalInOrder(root);
    }

    public void traversalInOrder(Node root){
        if (root == null) return;;

        traversalPreOrder(root.leftchild);
        System.out.println(root.value);
        traversalPreOrder(root.rightchild);
    }

    public void traversalPostOrder(){
        traversalPostOrder(root);
    }

    public void traversalPostOrder(Node root){
        if (root == null) return;;
        traversalPreOrder(root.leftchild);
        traversalPreOrder(root.rightchild);
        System.out.println(root.value);

    }

    private int heigth(){
        return height(root);
    }

    private int height(Node root){
        if(root == null) return 0;

        int lheight = height(root.leftchild);
        int rheight = height(root.rightchild);

        if (lheight>rheight){
            return (lheight+1);
        }else {
            return (rheight+1);
        }


    }

    public void traversalLevelOrder(){
        int h = heigth();
        for (int i = 1; i <=h ; i++) {
            traversalLevelOrder(root,i);
        }
    }

    public void  traversalLevelOrder(Node root,int level){
        if (root == null) return;;
        if (level == 1){
            System.out.println(root.value);
        }else {
            traversalLevelOrder(root.leftchild,level-1);
            traversalLevelOrder(root.rightchild,level-1);
        }


    }

}

package uz.pdp;


import com.sun.source.tree.Tree;

import java.util.Objects;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;



    public TreeNode find(Integer data){
        if(this.data == data){
            return this;
        }
        if (this.data < data && leftChild != null)
            return leftChild.find(data);
        if(rightChild != null)
            return rightChild.find(data);
        return null;

    }







    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}

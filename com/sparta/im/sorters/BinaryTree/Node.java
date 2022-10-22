package com.sparta.im.sorters.BinaryTree;

public class Node { private final int value;
    private Node leftChild; // Object tpe so can be null
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public Node getLeftChild(){
        return leftChild;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public Node getRightChild(){
        return rightChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    public boolean isLeftChildEmpty(){
        if (leftChild == null) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isRightChildEmpty(){
        if (rightChild == null) {
            return true;
        }else{
            return false;
        }
    }
}



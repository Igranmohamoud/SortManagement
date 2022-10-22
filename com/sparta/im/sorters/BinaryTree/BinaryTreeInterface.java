package com.sparta.im.sorters.BinaryTree;

import com.sparta.im.exceptions.ChildNotFoundException;

public interface BinaryTreeInterface  {

    int getRootElement();

    int getNumberOfElements(Node rootNode);

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}




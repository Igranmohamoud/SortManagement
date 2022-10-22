package com.sparta.im.start;

import com.sparta.im.sorters.BinaryTree.BinarySort;
import com.sparta.im.sorters.BubbleSort;
import com.sparta.im.sorters.MergeSort;
import com.sparta.im.sorters.Sortable;

public class SortFactory {
    public static Sortable getChosenSortAlgorithm(int chosenalgoritm) {
        return switch (chosenalgoritm) {
            case 1 -> new BubbleSort();
            case 2 -> new BinarySort();
            case 3 -> new MergeSort();
            default -> null;
        };
    }
}

package com.sparta.im.display;


import com.sparta.im.sorters.ArrayGenerator;
import com.sparta.im.sorters.Sortable;
import com.sparta.im.start.SortFactory;

import java.util.Arrays;


public class DisplayManager{

    public static void displayRunner (int chosenAlgorithm)  {

        switch (chosenAlgorithm) {
            case 1 -> System.out.println("You have chosen the BubbleSort method");
            case 2 -> System.out.println("You have chosen the BinarySort method");
            case 3 -> System.out.println("You have chosen the MergeSort method");
        };
    }

    public static void beforeSorting(int arraySize){
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(ArrayGenerator.generateRandomArray(arraySize)));
    }

    public static void afterSorting(int chosenAlgorithm, int arraySize)  {
        System.out.println("Sorted array:");
        long startTime = System.nanoTime();
        Sortable sortArray = SortFactory.getChosenSortAlgorithm(chosenAlgorithm);
        long endTime = System.nanoTime();
        System.out.println(sortArray.sort(ArrayGenerator.generateRandomArray(arraySize)));
        System.out.println("Time taken = " + (endTime-startTime) + "ns");
    }



}

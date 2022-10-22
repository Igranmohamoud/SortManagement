package com.sparta.im.sorters;

import com.sparta.im.Logging.CustomLoggerConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MergeSort implements Sortable  {
    public static final Logger logger = Logger.getLogger("my logger");

    public static int[] mergeSort(int[] inputArray) {
        CustomLoggerConfiguration.ConfigureLogger();

        int length = inputArray.length;

        int middleIndex = length / 2;
        int[] leftSide = new int[middleIndex];
        int[] rightSide = new int[length - middleIndex];

        System.arraycopy(inputArray, 0, leftSide, 0, middleIndex);

        System.arraycopy(inputArray, middleIndex, rightSide, 0, rightSide.length);
        leftSide = mergeSort(leftSide);
        rightSide = mergeSort(rightSide);
        logger.log(Level.INFO, "Array is split in to two, left side: " + Arrays.toString(leftSide) + "right side: " + Arrays.toString(rightSide));
        int[] mergeSortedArray = merge(leftSide,rightSide);
        logger.log(Level.INFO, "Already Sorted" + Arrays.toString(mergeSortedArray));
        return mergeSortedArray;
    }

    private static int[] merge(int[] leftSide, int[] rightSide) {

        int[] result = new int[leftSide.length+rightSide.length];
        int x = 0;
        int y = 0;
        int z = 0;
        while(x < leftSide.length && y < rightSide.length) {
            if(leftSide[x] <= rightSide[y]){
                logger.log(Level.FINE, "Swap found, swapping " + leftSide[x], rightSide[y]);
                result[z] = leftSide[x];
                x++;
            } else {
                result[z] = rightSide[y];
                y++;
            }
            z++;
        }

        while(x < leftSide.length){
            result[z] = leftSide[x];
            x++;
            z++;
        }

        while(y < rightSide.length){
            result[z] = rightSide[y];
            y++;
            z++;
        }

        logger.log(Level.INFO, "Sorted array: " + Arrays.toString(result));

        return result;

    }


    @Override
    public String sort(int[] arrayToSort) {

        return Arrays.toString(MergeSort.mergeSort(arrayToSort));
    }
}

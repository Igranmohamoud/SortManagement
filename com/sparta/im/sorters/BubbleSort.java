package com.sparta.im.sorters;

import com.sparta.im.Logging.CustomLoggerConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BubbleSort implements Sortable  {
    public static final Logger logger = Logger.getLogger("my logger");

    public static int[] bubbleSort(int[] arr) {
        CustomLoggerConfiguration.ConfigureLogger();
        logger.log(Level.INFO, "Sort type: bubblesort started");
        int i, j, temp = 0;
        for (i = 0; i < arr.length - 1; i++) {
            logger.log(Level.FINE, "Iterating through the outer loop: " + i);
            for (j = 0; j < arr.length - 1 - i; j++) {
                logger.log(Level.FINER, "Iterating through the inner loop: " + j);
                if (arr[j] > arr[j + 1]) {
                    logger.log(Level.FINEST, "Swap found, swapping:  " + arr[i] + arr[j]);
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        logger.log(Level.INFO, "Sorted array: " + Arrays.toString(arr));
        return arr;
    }

    @Override
    public String sort(int[] arrayToSort) {

        return Arrays.toString(BubbleSort.bubbleSort(arrayToSort));
    }


}



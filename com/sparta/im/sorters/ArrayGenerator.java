package com.sparta.im.sorters;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generateRandomArray(int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];
        for(int i=0; i <arraySize; i++ ) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}

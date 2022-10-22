package com.sparta.im.start;

import com.sparta.im.display.DisplayManager;


import java.util.Scanner;

public class SortLoader {
    public static void run() {

        System.out.println("Choose your Sort Algorithm: ");
        System.out.println("1. BubbleSort");
        System.out.println("2. BinarySort");
        System.out.println("3. MergeSort");

        Scanner scanner = new Scanner(System.in);
        int chosenAlgorithm = scanner.nextInt();
        DisplayManager.displayRunner(chosenAlgorithm);

        System.out.println("Enter how many numbers you want in your array:");
        Scanner scanner2 = new Scanner(System.in);
        int arraySize = scanner2.nextInt();
        DisplayManager.beforeSorting(arraySize);
        DisplayManager.afterSorting(chosenAlgorithm, arraySize);
    }
}

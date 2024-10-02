package Behavioral.Strategy.SortAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 12, -5, 16};
        // Bubble Sort
        SortContext context = new SortContext(new BubbleSort());
        context.executeSort(array);
        System.out.println("Nəticə: " + Arrays.toString(array));

        // Quick Sort
        array = new int[]{5, 1, 12, -5, 16};
        context = new SortContext(new QuickSort());
        context.executeSort(array);
        System.out.println("Nəticə: " + Arrays.toString(array));

        // Merge Sort
        array = new int[]{5, 1, 12, -5, 16};
        context = new SortContext(new MergeSort());
        context.executeSort(array);
        System.out.println("Nəticə: " + Arrays.toString(array));
    }
}

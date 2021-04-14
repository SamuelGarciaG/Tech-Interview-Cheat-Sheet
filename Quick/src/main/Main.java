package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 5, -20, 20, 15, 1, -22};

        System.out.println("Given Array: " + Arrays.toString(array));
        quickSort(array,0, array.length);
        System.out.println("Sorted array " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end){
        if(end-start < 2) return;

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex+1, end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i<j){
            //empty body loop, to decrement j value
            while(i<j && array[--j] >= pivot);

            if(i<j) array[i] = array[j];

            //empty body loop, to increment i value
            while(i<j && array[++i] <= pivot);

            if(i<j) array[j] = array[i];
        }

        array[j] = pivot;
        return j;
    }
}

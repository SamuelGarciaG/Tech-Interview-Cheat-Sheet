package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Given Array: " + Arrays.toString(array));
        mergeSort(array, array.length);
        System.out.println("Sorted array " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            rightArray[i - mid] = array[i];
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, n - mid);

        merge(array, leftArray, rightArray, mid, n - mid);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, tempIndex = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[tempIndex++] = leftArray[i++];
            }
            else {
                array[tempIndex++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[tempIndex++] = leftArray[i++];
        }
        while (j < right) {
            array[tempIndex++] = rightArray[j++];
        }
    }
}
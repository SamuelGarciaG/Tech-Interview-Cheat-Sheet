package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {10, 3, -2, 23, 8, 13, -6};

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) largest = i;
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}

package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array before: " + Arrays.toString(array));
        System.out.println("Array after: " + Arrays.toString(insertion(array)));
        int[] array2 = {20, 35, -15, 7, 55, 1, -22};
        recursiveInsertion(array2, array.length);
        System.out.println("Array after recursive: " + Arrays.toString(array2));
    }

    public static int[] insertion(int[] array){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int j;
            for (j = firstUnsortedIndex; j > 0 && array[j-1] > newElement; j--) {
                    array[j] = array[j-1];
            }
            array[j] = newElement;
        }
        return array;
    }

    public static void recursiveInsertion(int[] array, int elementNumber) {
        if (elementNumber < 2) return;
        recursiveInsertion(array, --elementNumber);
        int insertion = array[elementNumber];
        int j;
        for (j = elementNumber; j > 0 && array[j-1] > insertion; j--) {
            array[j] = array[j-1];
        }
        array[j] = insertion;
    }
}

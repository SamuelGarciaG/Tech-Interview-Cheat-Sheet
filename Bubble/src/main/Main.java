package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,2,-3,14,5,2,8};

        for (int lastUnsortedPosition = array.length-1; lastUnsortedPosition > 0; lastUnsortedPosition--) {
            for (int j = 0; j < lastUnsortedPosition; j++) {
                if(array[j] > array[j+1]){
                    System.out.println("Array before: "+ Arrays.toString(array));
                    System.out.println(array[j]+" moved where " +array[j+1]);
                    int bubble = array[j];
                    array[j] = array[j+1];
                    array[j+1]= bubble;
                    System.out.println("Array after: "+ Arrays.toString(array));
                }
            }
        }
    }
}

package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array ={8, 2 , 7, 5, 4, 8, 4, 1, 3, 2, 5, 8, 8};
        System.out.println("Array before: "+ Arrays.toString(array));
        countingSort(array, 1, 8);
        System.out.println("Array after: "+ Arrays.toString(array));
    }

    private static void countingSort(int[] array, int min, int max) {
        int length = max-min+1;
        int[] countingArray = new int[length];

        for(int i=0; i < array.length; i++){
            countingArray[array[i]-min]++;
        }

        int j = 0;
        for (int i = min; i <=max ; i++) {
            while(countingArray[i-min]>0){
                array[j++]=i;
                countingArray[i-min]--;
            }
            
        }

    }


}

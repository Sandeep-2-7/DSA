package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(bubbleSort(arr, n)));
    }

    private static int[] bubbleSort(int[] arr, int n) {
        for(int j=n-1;j>=0;j--){
            int swap = 0;
            for(int i=0;i<j;i++){
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap=1;
                }
                if(swap==0)
                    break;
            }
        }
        return arr;
    }
}

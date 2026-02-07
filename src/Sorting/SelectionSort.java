package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }
//    23 356 4 54 23  5
//       0  1  2  3  4  5
    public static int[] selectionSort(int[] arr, int n){

        for(int i=0;i<n-1;i++){
            int small=arr[i];
            int index=i;
            for(int j=i+1;j<n;j++){
                if(small>arr[j]){
                    small=arr[j];
                    index=j;}
            }
//            System.out.println(small+" "+index);
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}

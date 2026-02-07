package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Bubble_Sort_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        BSRecursive(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void BSRecursive(int[] arr, int n){
        int count = 0;
        boolean swap = false;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }
        }
        if (swap)
            BSRecursive(arr,n-1);
        else
            return;
    }
}

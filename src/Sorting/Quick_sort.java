package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            System.out.println("in quicksort method");
            int parEle = partition(arr,low,high);
            quickSort(arr,low,parEle-1);
            quickSort(arr,parEle+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j){
            while(i<=high && pivot >= arr[i]){
                i++;
            }

            while(j>=low && pivot < arr[j] ){
                j--;
            }

            if(i>j)
                swap(arr,j,low);
            else {
                System.out.println(Arrays.toString(arr));
                swap(arr, i, j);
                System.out.println(Arrays.toString(arr));
            }
        }

        return j;

//        while(i<j){
//            while(arr[pivot]<=arr[i] && i<=high) {
//
//                while (arr[pivot] > arr[j] && j >= low) {
//                    System.out.println(arr[i] + " " + arr[j]);
//                    swap(arr, i, j);
//                    System.out.println(arr[i] + " " + arr[j]);
//                    System.out.println(Arrays.toString(arr));
//                    j--;
//                }
//                i++;
//            }
//        }
//
//        if(i>=j)
//            swap(arr,low,j);
//
//        return j;
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

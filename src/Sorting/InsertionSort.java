package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(insertionSort(arr, n)));
    }

//    14 5 9
    public static int[] insertionSort(int[] arr, int n){

        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                System.out.println("c");
            }
        }
        return arr;
    }

//    14 15 9
//    14 9 15
//    private static int[] insertionSort(int[] arr, int n) {
//
//        for(int i=0;i<n-1;i++){
//            int compare = i+1;
//            for(int j=i;j>=0;j--){
//                if(arr[compare]<arr[j])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[compare];
//                    arr[compare]=temp;
//                    compare=j;
//                    System.out.println(arr[compare]+" "+compare+"");
//                }
//            }
//        }
//        return arr;
//    }
}

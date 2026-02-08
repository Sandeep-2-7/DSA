package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SSRecursive(arr,0);
        System.out.println(Arrays.toString(arr));
    }

//    public static void SSRecursive(int[] arr, int n){
//        if(n>arr.length-1) {
//            return;
//        }
//            for (int i = n; i > 0; i--) {
//                if (arr[i] < arr[i - 1]) {
//                    int temp = arr[i - 1];
//                    arr[i - 1] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//
//        SSRecursive(arr,n+1);
//    }

    public static void SSRecursive(int[] arr, int n){
        if(n==arr.length)
            return;
        int min =n;
        for(int i=n+1;i<arr.length;i++) {
            if (arr[min] > arr[i]){
                min=i;
                arr[min] = arr[i];
        }
        }
//        System.out.println(arr[n]+""+n+""+arr[min]+""+min);
        int temp = arr[n];
        arr[n] = arr[min];
        arr[min] = temp;
//        System.out.println(arr[n]+""+arr[min]);
        SSRecursive(arr,n+1);
    }
}

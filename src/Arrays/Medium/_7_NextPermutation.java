package Arrays.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _7_NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nextPermutation(nums)));
    }

        public static int[] nextPermutation(int[] arr){
        int len = arr.length;
        int pivot = -1;

        for(int i=len-1;i>0;i--){
            if(arr[i] > arr[i-1])
            {
                pivot = i-1;
                break;
            }
        }

        if(pivot==-1){
            reverse(arr,0,arr.length-1);
            return arr;
        }

        int largest = arr[pivot+1];
        int index=pivot+1;
        for(int i=pivot+1;i<arr.length;i++){
            if(arr[pivot] < arr[i])
                if(largest>=arr[i]){
                    largest=arr[i];
                    index=i;
                }
        }
        swap(arr,pivot,index);
        reverse(arr,pivot+1,arr.length-1);
        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

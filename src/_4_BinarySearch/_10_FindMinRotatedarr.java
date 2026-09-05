package _4_BinarySearch;

import java.util.Scanner;

public class _10_FindMinRotatedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(pivot(nums));
        System.out.println(pivotV2(nums));
    }
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (end-start)/2 + start;

            if(mid<end && arr[mid] > arr[mid+1])
                return arr[mid+1];
            else if(start<mid && arr[mid-1]>arr[mid])
                return arr[mid];
            else if(arr[start] <= arr[mid] && arr[mid] <= arr[end])
                return arr[start];
            else if(arr[start] <= arr[mid] && arr[mid] >= arr[end])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    public static int pivotV2(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (end-start)/2 + start;

            if(arr[mid] > arr[end])
                start=mid+1;
            else
                end=mid;
        }
        return arr[start];
    }
}
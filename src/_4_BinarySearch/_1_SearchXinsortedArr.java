package _4_BinarySearch;

import java.util.Scanner;

public class _1_SearchXinsortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the target");
        int target = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(BinarySearch(nums, 0, nums.length-1, target));
    }

    public static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start-end)/2 + end;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int start, int end, int target){

        int mid = (end-start)/2 + start;
        if(arr.length == 0 || start>end)
            return -1;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] > target)
            BinarySearch(arr, start, mid-1, target);

        return BinarySearch(arr, mid+1, end, target);

    }
}

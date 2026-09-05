package _4_BinarySearch;

import java.util.Scanner;

public class _8_SearchInRotatedarr {
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
        System.out.println(searching(nums, target));

//        int ans = -1;
//        if(nums[pivot] == target)
//            ans = pivot;
//        else if(pivot-1>=0 && nums[0] <= target && target <= nums[pivot-1])
//            ans = BS(nums, 0, pivot-1, target);
//        else if(nums[pivot] <= target && target <= nums[nums.length-1])
//            ans = BS(nums, pivot, nums.length-1, target);
//        System.out.println(ans);
    }

    public static int BS(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = (end-start)/2 + start;

            if(arr[mid] > target)
                end = mid-1;
            else if(arr[mid] < target)
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = (end - start)/2 + start;

            if(arr[mid] > arr[end])
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }

    public static int searching(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (end - start)/2 + start;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] >= arr[start]){
                if(arr[start] <= target && target <= arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else if(arr[mid] <= arr[end]){
                if(arr[mid] <= target && target <= arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }


        }

        return -1;
    }
}
package _4_BinarySearch;

import java.util.Scanner;

public class _9_SearchInRotatedArr2 {
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
    }

    public static int searching(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = (end-start)/2 + start;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] == arr[start] && arr[mid] == arr[end])
                 {
                     start++;
                     end--;
                 }
              //  return linearSearch(arr,start,end,target);
            else if(arr[mid] >= arr[start]){
                if(arr[start] <= target && target <=arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else if(arr[mid] <= arr[end]){
                if(arr[mid] <= target && target <= arr[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int start, int end, int target){
        for(int i=start;i<=end;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
package _4_BinarySearch;

import java.util.Scanner;

public class _7_CountTheOccurences {
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

        int a=first(nums, target);
        if(a == -1)
            System.out.println("Length is -1");
        else{
            int b=last(nums,target);
            System.out.println("Length is "+ (b-a+1));
        }

    }

    public static int first(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start<=end){
            int mid = (end-start)/2 + start;

            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }

    public static int last(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start<=end){
            int mid = (end-start)/2 + start;

            if(arr[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }
}

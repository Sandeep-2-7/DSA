package _4_BinarySearch;

import java.util.Scanner;

public class _11_TimesOfArrRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = pivotV2(nums);
        if( ans== 0)
            System.out.println(nums.length);
        else
            System.out.println(ans);
    }

    public static int pivotV2(int[] arr){
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
}

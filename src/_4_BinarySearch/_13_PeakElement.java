package _4_BinarySearch;

import java.util.Scanner;

public class _13_PeakElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans=peak(nums);


        System.out.println(ans);
    }

    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = (end-start)/2 + start;

            if(arr[mid] > arr[mid+1])
                end=mid;
            else if(arr[mid] < arr[mid+1])
                start=mid+1;
        }
        return start;
    }
}

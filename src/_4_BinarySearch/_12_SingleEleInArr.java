package _4_BinarySearch;

import java.util.Scanner;

public class _12_SingleEleInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleEleV2(nums));
    }

    public static int singleEle(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (end-start)/2 + start;

            if(arr[start] == arr[start+1])
                start=start+2;
            else
                return arr[start];

            if(arr[end] == arr[end-1])
                end=end-2;
            else
                return arr[end];
        }
        return -1;
    }

    public static int singleEleV2(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(start<end){
            mid = (end-start)/2 + start;

            if(mid%2 != 0 && arr[mid] == arr[mid-1])
                start=mid+1;
            else if(mid%2 !=0 && arr[mid] == arr[mid+1])
                end=mid-1;
            else if(mid%2 == 0 && arr[mid] == arr[mid+1])
                start = mid+2;
            else
                end=mid-1;
        }
        return start;
    }
}

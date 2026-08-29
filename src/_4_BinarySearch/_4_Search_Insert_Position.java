package _4_BinarySearch;

import java.util.Scanner;

public class _4_Search_Insert_Position {
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
        System.out.println(insertPosition(nums, 0));
    }

    public static int insertPosition(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            int ans = arr.length;

            while(start <= end){
                int mid = (end-start)/2 + start;

                if(arr[mid] >= target){
                    ans = mid;
                    end = mid - 1;
                }else{
                    start=mid + 1;
                }
            }
            return ans;
        }

}

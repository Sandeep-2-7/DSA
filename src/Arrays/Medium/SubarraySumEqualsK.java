package Arrays.Medium;

import java.util.Scanner;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for 1st array : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Subarray(nums,target));
    }

    public static int Subarray(int[] arr, int target){
        int n = arr.length;
        int count = 0;
        int sum = 0;

        for(int i=0;i<n;i++){
                sum = sum + arr[i];
                if(sum == target)
                    count++;


        }
        return count;
    }
}

package Arrays.Easy;

import java.util.Scanner;

public class LongestSubArraySumEqualsK {
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
        System.out.println(equalsK(nums,target)+1);
    }

    public static int equalsK(int[] arr, int target){
        int longest = -1;
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int sum = arr[i];
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];

                if(sum == target && longest<j)
                    longest = j-i;

                if(longest == n-i)
                    return longest;
            }
        }
        return longest;
    }
}

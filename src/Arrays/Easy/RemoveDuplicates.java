package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int set = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[set-1])
            {
                nums[set]=nums[i];
                set++;
            }
        }
        return set;
    }
}

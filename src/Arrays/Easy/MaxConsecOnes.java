package Arrays.Easy;

import java.util.Scanner;

public class MaxConsecOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for 1st array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int largest = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
                count++;
            else if(nums[i] == 0)
            {
                if(largest < count)
                    largest = count;
                count = 0;
            }
        }
        if(largest < count)
            largest = count;

        return largest;
    }
}

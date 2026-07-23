package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class _5_StockBuyandSell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Profit is : " + maxProfit(nums));
    }

    public static int maxProfit(int[] nums) {
        int pointer = nums[0];
        int diff = 0;
        int maxProfit = 0;

        for(int i=0;i<nums.length;i++){
            diff = pointer - nums[i];

            if(diff>0)
                pointer = nums[i];
            if(maxProfit>diff)
                maxProfit=diff;
        }
        return Math.abs(maxProfit);
    }

}

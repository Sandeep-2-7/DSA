package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class _6_Rearrange_Ele_By_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Rearranged array is : " + Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int[] updatedArr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                updatedArr[positive] = nums[i];
                positive = positive+2;
            }
            else if(nums[i] < 0){
                updatedArr[negative] = nums[i];
                negative = negative+2;
            }
        }

        return updatedArr;
    }
}

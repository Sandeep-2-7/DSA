package Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target :");
        int target = sc.nextInt();
        int index = -1;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == target)
                index = i;
        }
        System.out.println(index);
    }
}

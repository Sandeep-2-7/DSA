package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_0_1_and_2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sort012s(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort012s(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else if (arr[i] == 2)
                count2++;
        }

        for(int i=0;i< count0;i++){
            arr[i] = 0;
        }

        for(int i=0; i<count1; i++){
            arr[i+count0] = 1;
        }

        for(int i=0;i<count2; i++){
            System.out.println();
            arr[i+count0+count1] = 2;
        }
    }
}

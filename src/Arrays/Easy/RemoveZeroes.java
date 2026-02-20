package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if(nums.length == 1 || (nums.length==2 && nums[0]!=0))
            return;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0 && nums[j] == 0)
                continue;
            else if(nums[i] != 0 &&  nums[j] == 0)
                j=swap(nums,i,j);
            else if(nums[i] != 0 && nums[j] !=0)
            {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        if(arr[j+1] == 0)
            j=j+1;
        else
            j=i;
        return j;
    }
}

package Arrays.Easy;

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for 1st array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNum(nums));
    }

    public static int missingNum(int[] arr){
        int miss = -1;
        int n = arr.length + 1;

        int total1 = n*(n+1)/2;
        int total2 = 0;
        for(int i=0;i<arr.length;i++){
            total2 = total2 + arr[i];
        }
        miss = total1 - total2;
        return miss;
    }
}

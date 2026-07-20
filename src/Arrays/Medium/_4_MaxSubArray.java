package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Length is : " + Arrays.toString(maxSubArrayV3(nums)));
    }

    public static int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i], largestSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (largestSum < sum)
                    largestSum = sum;
                if (largestSum < 0)
                    break;
            }
            if (ans < largestSum)
                ans = largestSum;
        }
        return ans;
    }

    public static int maxSubArrayV2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int[] maxSubArrayV3(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int track = 0;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
                start=track;
                end=i;
            }
            if (sum < 0) {
                sum = 0;
                track = i+1;
            }
        }
        return new int[]{start, end};
    }
}
package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
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

     //   System.out.println(equalsK(nums,target)+1);
        System.out.println(equalsKV2(nums,target));
//         System.out.println(countV2(nums,target));
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

    public static int equalsKV2(int[] arr, long target) {

        int n = arr.length;
        int longest = 0;
        long sum = 0L;

        Map<Long, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            long check = sum - target;

            if (sum == target) {
                longest = i + 1;
            }

            if (count.containsKey(check)) {
                if (i - count.get(check) > longest) {
                    longest = i - count.get(check);
                }
            }

            if (!count.containsKey(sum)) {
                count.put(sum, i);   // store first occurrence
            }
            System.out.println(count);
        }

        return longest;
    }

    public static int countV2(int[] arr, int target) {

        int n = arr.length;
        int count1 = 0;
        long sum = 0L;
        int incre = 1;

        Map<Long, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            long check = sum - target;

            if (sum == target) {
                count1++;
            }

            if (count.containsKey(check) && sum==target) {
                count1=count1+incre++;
            }
            else if(count.containsKey(check))
                count1++;

            count.put(sum, i);

        }
        System.out.println(count.get(0L));
        return count1;
    }
}

package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
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
//        System.out.println(Arrays.toString(findIndex(nums,target)));
        System.out.println(Arrays.toString(findIndexV2(nums,target)));
    }

    public static int[] findIndexV2(int[] arr, int target){

        Map<Integer, Integer> duplicateMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!duplicateMap.containsKey(arr[i]))
                duplicateMap.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int search=target-arr[i];
            if(duplicateMap.containsKey(search) && i!=duplicateMap.get(search))
                return new int[]{i,duplicateMap.get(search)};
        }
        return new int[]{0,0};
    }

    public static int[] findIndex(int[] arr, int target) {

        int n = arr.length;
        int ans[] = new int[2];
        long sum = 0L;

        Map<Long, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            long check = sum - target;

            if (sum == target) {
                ans[0]=0;
                ans[1]=i;
            }

            if (count.containsKey(check)) {
                // if (i - count.get(check) > longest) {
                //     longest = i - count.get(check);
                // }
                ans[0]=count.get(check)+1;
                ans[1]=i;
            }

            if (!count.containsKey(sum)) {
                count.put(sum, i);   // store first occurrence
            }
            System.out.println(count);
        }
        return ans;
    }

}



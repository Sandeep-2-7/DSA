package _3_Arrays.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _13_SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(total(nums,target));
    }

    public static int total(int[] arr, int target){
        Map<Integer, Integer> result = new HashMap<>();
        int count = 0;
        int check = 0;
        int prefixSum = 0;
        result.put(0,1);

        for(int i=0;i<arr.length;i++){
                prefixSum+=arr[i];
                check=prefixSum-target;

                if(result.containsKey(check)){
                    count+=result.get(check);
                }
                    result.put(prefixSum,result.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
}

package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberThatAppearsOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for 1st array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        System.out.println(search(nums));
        System.out.println(searchV2(nums));
    }

    public static int search(int[] arr){

        int n = arr.length;
//        int skip = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int count = 0;

            for(int j=0;j<n;j++){
                if(count>1)
                    break;
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1)
                return arr[i];
        }
        return -1;
    }

    public static int searchV2(int[] arr){

        int n = arr.length;
        Map<Integer, Integer> result = new HashMap<>();

        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0)
                temp++;
            result.put(arr[i], result.getOrDefault(arr[i],0)^arr[i]);
//            result.put(arr[i], result.get(arr[i])^arr[i]);
        }


        for(Map.Entry<Integer,Integer> r : result.entrySet()){
            if(r.getValue()!=0)
                return r.getValue();
        }
//        for(int i=0;i<n;i++){
//
//            if(result.get(arr[i])!=0)
//                return result.get(arr[i]);
//        }

        return temp!=0 ? 0:-1;
    }
}

package Arrays.Medium;

import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        MajorityEle(nums);
        System.out.println(MajorityEleV2(nums));
    }

    public static int MajorityEleV2(int[] arr){
        int start = 0;
        int element = arr[start];
        int count = 1;
        for(int i=1;i< arr.length;i++){

            if(element == arr[i])
                count++;
            else
                count--;

            if(count == 0)
                element = arr[i+1];
        }
        return element;
    }


    public static int MajorityEle(int[] arr){
        Map<Integer, Integer> maxEle = new HashMap<>();
//        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(maxEle.containsKey(arr[i])){
                maxEle.put(arr[i], maxEle.get(arr[i])+1);
            }
            if (!maxEle.containsKey(arr[i])) {
                maxEle.put(arr[i],1);
            }
        }

        int maxKey = maxEle.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        return maxKey;
    }
}

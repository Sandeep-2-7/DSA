package Arrays.Medium;

import java.util.*;

public class _3_Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        MajorityEle(nums);
        System.out.println(boyerMooreAlgo(nums));
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

    public static int Max(int[] arr){
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
           if(countMap.containsKey(arr[i]))
               countMap.put(arr[i], countMap.getOrDefault(arr[i],0)+1);
//               countMap.put(arr[i],countMap.get(arr[i])+1);
           else
               countMap.put(arr[i],1);
        }
        int largest = 0;
        int larCount = 0;
        for(Map.Entry<Integer, Integer> e: countMap.entrySet()){
           if(e.getValue()>larCount){
               largest=e.getKey();
               larCount=e.getValue();
           }
        }

        return largest;
    }

    public static int boyerMooreAlgo(int[] arr){
        int count = 1;
        int currEle = arr[0];

        for(int i=1;i<arr.length;i++){
            if(count == 0) {
                currEle = arr[i];
                count++;
            }
            else if(currEle == arr[i])
                count++;
            else if (currEle != arr[i])
                count--;


        }
        return currEle;
    }
}

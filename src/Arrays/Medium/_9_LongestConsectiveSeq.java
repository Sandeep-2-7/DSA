package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _9_LongestConsectiveSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(longSeqv3(nums));
    }

    //[100,4,200,1,3,2]
    public static int longSeq(int[] arr){
        int largestLen = 1;
        int count=1;
        if(arr ==  null || arr.length == 0)
            return 0;
        for(int i=0;i<arr.length;i++){
            int start = arr[i]+1;
            count = 1;

            for(int j=0;j<arr.length;j++){
                if(count<1){
                    break;
                }
                for(int k=0;k<arr.length;k++){
                    if(arr[k] == start){
                        count++;
                        start++;
                        break;
                    }
                }

            }
            if(largestLen<count)
                largestLen=count;
        }

        return largestLen;
    }

    public static  int longSeqv2(int[] arr){
        if(arr.length == 0)
            return 0;
        Arrays.sort(arr);
        int start = arr[0];
        int count = 1;
        int res = 1;

        for(int i=1;i<arr.length;i++){

            if(start+1 == arr[i]){
                start++;
                count++;
            }
            else if(start==arr[i]){
                continue;
            }
            else{
                count = 1;
                start=arr[i];
            }
            if(res<count)
                res=count;
        }
        return res;
    }

    public static int longSeqv3(int[] arr){
        if(arr.length == 0)
            return 0;
        Set<Integer> newSet = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            newSet.add(arr[i]);
        }

        int largest = 1;
        for(Integer num:newSet){
            if(!newSet.contains(num-1)){
                boolean check = true;
                int count=1;
                int index = 1;
                while(check){
                    if(newSet.contains(num+index)){
                        count++;
                        index++;
                    }
                    else {
                        check = false;
                    }
                }
                largest = Math.max(count,largest);
            }
        }
        return largest;
    }
}

package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _8_LeaderInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println((Leader(nums)));
    }

    public static List<Integer> Leader(int[] arr){
        int largest = arr[arr.length-1];
        List<Integer> res = new ArrayList<>();
        int index = 0;
        res.add(largest);

        for(int i=arr.length-2;i>=0;i--){
            if(largest < arr[i]){
                largest=arr[i];
                res.add(largest);
            }
        }
        reverse(res);
        return res;
    }

    public static void reverse(List<Integer> res){
        int start = 0;
        int end = res.size()-1;

        while(start<end){
            swap(res,start,end);
            start++;
            end--;
        }
    }

    public static void swap(List<Integer> res, int a, int b){
        int temp = res.get(a);
        res.set(a, res.get(b));
        res.set(b, temp);
    }
}

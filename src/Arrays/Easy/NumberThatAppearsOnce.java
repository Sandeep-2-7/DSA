package Arrays.Easy;

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
        System.out.println(search(nums));
    }

    public static int search(int[] arr){

        int n = arr.length;
//        int skip = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int count = 0;

            for(int j=0;j<n;j++){

                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1)
                return arr[i];
        }
        return -1;
    }
}

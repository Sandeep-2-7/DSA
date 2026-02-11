package Arrays.Easy;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println(largest);
    }
}

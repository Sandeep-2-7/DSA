package _4_BinarySearch;

import java.util.Scanner;

public class _1_SearchXinsortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    }

//    public static int BS(int[] arr){
//
//    }
}

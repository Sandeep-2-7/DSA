package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(checkPalindrome2(arr, 0, num-1));
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void palindrome(int[] arr, int start, int end){
        if(start >= arr.length/2)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        palindrome(arr,start+1,end-1);
    }

    public static boolean checkPalindrome(int arr[], int start, int end){
        if(start>=end)
            return true;
        if(arr[start] != arr[end])
            return false;
        return checkPalindrome(arr,start+1,end-1);
    }


    public static boolean checkPalindrome2(int arr[], int start, int end){
        if(start>=end)
            return true;
        if(arr[start] == arr[end])
            return checkPalindrome2(arr,start+1,end-1);

        return false;
    }
}

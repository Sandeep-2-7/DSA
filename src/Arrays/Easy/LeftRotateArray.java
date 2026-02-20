package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int rotate = sc.nextInt();
//        LeftRotate(arr, rotate);
//        LeftRotate2(arr,rotate);
        RightRotate(arr,rotate);
        System.out.println(Arrays.toString(arr));
    }

//    1 2 3 4 5 6 7
//    4 5 6 7 1 2 3


    public static void RightRotate(int[] arr, int rotate){
        rotate = rotate % arr.length;
        rotate= arr.length - rotate;
        reverse(arr,0,rotate-1);
        reverse(arr,rotate,arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    public static void LeftRotate2(int[] arr, int rotate){
        rotate = rotate% arr.length;
        reverse(arr,0,rotate-1);
        reverse(arr,rotate,arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    public static void LeftRotate(int[] arr, int rotate){
        rotate = rotate% arr.length;
        int[] temp = new int[rotate];
        for(int i=0;i<rotate;i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        int count = 0;
        for(int i=rotate;i<arr.length;i++){
            arr[count++]=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        for(int i=0;i< temp.length;i++){

            arr[count++]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i, int j){
     while(i<=j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;
     }
    }
}

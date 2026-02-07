package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        rev2(arr,0,num);
//        rev(arr,0,num-1);


        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void rev(int[] arr, int start, int end){
        if(start>=end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rev(arr, start + 1, end - 1);
    }

    public static void rev2(int[] arr, int start, int n){
        if(start>=arr.length/2)
            return;
        int temp = arr[start];
        arr[start] = arr[n-1];
        arr[n-1] = temp;
        rev2(arr, start + 1, n - start - 1);
    }
}

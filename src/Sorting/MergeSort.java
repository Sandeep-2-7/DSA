package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int low, int high){
        if(low<high)
        {
            int mid = (low+high)/2;
            sorting(arr,low,mid);
            sorting(arr,mid+1,high);
            mergeArr(arr,low,mid,high);
        }

    }

    public static void mergeArr(int[] arr, int low, int mid, int high){

        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<Integer>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i]= temp.get(i - low);
        }

    }
}

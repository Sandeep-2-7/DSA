package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOFSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for 1st array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the length for 2nd array : ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println(Union(nums, nums2));
    }

    public static List<Integer> Union(int[] arr1, int[] arr2){

        int i =0,j =0,k =0;
        List<Integer> res = new ArrayList<Integer>();
        while(i<arr1.length || j<arr2.length){
            if(arr1.length == i && j<arr2.length){
                res.add(arr2[j]);
                j++;
                k++;
                continue;
            }
            if(arr2.length == j && i<arr1.length){
                res.add(arr1[i]);
                i++;
                k++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                if(res.size()> 0 && res.get(k-1) == arr1[i]){
                    i++;
                    continue;
                }
                else{
                    res.add(arr1[i]);
                    i++;
                    k++;
                }
            } else if (arr1[i]>arr2[j]) {
                if(res.size()> 0 && res.get(k-1) == arr2[j]){
                    j++;
                    continue;
                }
                else {
                    res.add(arr2[j]);
                    j++;
                    k++;
                }
            } else if (arr1[i] == arr2[j]) {
                if(res.size()> 0 && res.get(k-1) == arr1[i]){
                    i++;
                    j++;
                }
                else {
                    res.add(arr1[i]);
                    k++;
                    i++;
                    j++;
                }
            }
        }
        return res;
    }
}

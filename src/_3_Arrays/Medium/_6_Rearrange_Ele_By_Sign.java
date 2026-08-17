package _3_Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _6_Rearrange_Ele_By_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//        System.out.println("Rearranged array is : " + Arrays.toString(rearrangeArray(nums)));
//        System.out.println("Rearranged array is : " + Arrays.toString(rearrangeArr(nums)));
        rearrangeArrayOfNotSameSize(nums);
        System.out.println(Arrays.toString(nums));
    }


    //TC = O(N)
    //SC = O(N)
    public static int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int[] updatedArr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                updatedArr[positive] = nums[i];
                positive = positive+2;
            }
            else if(nums[i] < 0){
                updatedArr[negative] = nums[i];
                negative = negative+2;
            }
        }
        return updatedArr;
    }

    //TC = O(N2)
    //SC = O(1)
    public static int[] rearrangeArr(int[] arr){
       //  List<Integer> position = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if((i%2 == 0 && arr[i]<0) || (i%2==1 && arr[i]>0)){
                int j=i+1;

                while(j<arr.length){
                    if((i%2==0 && arr[j]>0) || (i%2==1 && arr[j]<0))
                        break;
                    j++;
                }

                if(j== arr.length)
                    break;

                rightRotate(arr,i,j);
            }
        }
        return arr;
    }

    public static void rightRotate(int[] arr, int left, int right){
        int temp = arr[right];
        while(left<right){
            arr[right]=arr[--right];
            System.out.println(Arrays.toString(arr));
        }
        arr[left]=temp;
    }

    public static void rearrangeArrayOfNotSameSize(int[] arr){
        List<Integer> positiveArr = new ArrayList<>();
        List<Integer> negativeArr = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                positiveArr.add(arr[i]);
            else
                negativeArr.add(arr[i]);
        }

        int len = Math.min(positiveArr.size(), negativeArr.size());

        for(int i=0;i<len;i++){
            arr[i*2]=positiveArr.get(i);
            arr[i*2+1]=negativeArr.get(i);
        }

        int len2 = Math.max(positiveArr.size(), negativeArr.size());
        int index = len*2;
        for(int i=len;i<len2;i++){
            if(positiveArr.size()>negativeArr.size()){
                arr[index] = positiveArr.get(i);
            }
            else
                arr[index] = negativeArr.get(i);

            index++;
        }
    }
}

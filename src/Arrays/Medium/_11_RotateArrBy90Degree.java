package Arrays.Medium;

import java.util.Scanner;

public class _11_RotateArrBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0;j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        arrangeBy90(nums);
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    public static void arrangeBy90(int[][] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            for(int i=start;i<arr.length;i++){
               int temp = arr[start][i];
               arr[start][i] = arr[i][start];
               arr[i][start] = temp;
            }

            start++;
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }
}

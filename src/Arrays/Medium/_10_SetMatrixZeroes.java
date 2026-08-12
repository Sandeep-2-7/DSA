package Arrays.Medium;

import java.util.*;
public class _10_SetMatrixZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for array : ");
        int n = sc.nextInt();
        System.out.println("Enter the width of the array : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array : ");

        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0; j < m; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        setMatrix0V2(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    public static void setMatrix0(int[][] arr){
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columnns = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0) {
                    rows.add(i);
                    columnns.add(j);
                }
            }
        }

        for(Integer i: rows){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=0;
            }
        }
        for(Integer col:columnns){
            for(int j=0;j<arr.length;j++){
                arr[j][col]=0;
            }
        }
    }

    public static void setMatrix0V2(int[][] arr){
        int col0 = arr[0][0];
        for(int i=0;i<arr.length;i++){
           for(int j=0;j< arr[0].length;j++){
               if(arr[i][j] == 0){
                   arr[0][j] = 0;

                   if(i != 0){
                       arr[i][0] = 0;
                   }
                   else{
                       col0 = 0;
                   }
               }
           }
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j< arr[0].length;j++){
                if(arr[i][0] == 0 || arr[0][j] == 0 || arr[i][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0 || arr[0][0] == 0)
                arr[i][0] = 0;
        }

        for (int i = arr[0].length - 1; i >= 0; i--) {
            if (arr[0][i] == 0 || col0 == 0)
                arr[0][i] = 0;
        }




        }
}

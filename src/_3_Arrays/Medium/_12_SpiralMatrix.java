package _3_Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _12_SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        System.out.println("Enter the width of the array : ");
        int width = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[][] nums = new int[len][width];
        for (int i = 0; i < len; i++) {
            for(int j = 0;j < width; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(sprialMatrixV2(nums));
    }

    public static List<Integer> sprialMatrixV2(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bottom = arr.length-1;

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
            }
            left++;
        }
        return list;
    }



        public static List<Integer> sprialMatrix(int[][] arr){
            int start = 0;
            int end = arr[0].length-1;
            int width = arr.length-1;
            List<Integer> list = new ArrayList<>();

            while(start <= end && start<=width){

                if(list.size() == arr.length*arr[0].length)
                    break;

                for(int i=start;i<=end;i++){
                    list.add(arr[start][i]);
                }

                if(list.size() == arr.length*arr[0].length)
                    break;

                for(int i=start+1;i<width;i++){
                    list.add(arr[i][end]);
                }

                if(list.size() == arr.length*arr[0].length)
                    break;

                for(int i=end;i>start;i--){
                    list.add(arr[width][i]);
                }

                if(list.size() == arr.length*arr[0].length)
                    break;

                for(int i=width;i>start;i--){
                    list.add(arr[i][start]);
                }

                start++;
                width--;
                end--;
            }
            return list;
        }
}

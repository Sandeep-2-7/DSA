package Arrays.Easy;

import java.util.Scanner;

public class ArraySortedRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {
        boolean f = false;
        if (arr.length <= 2)
            return true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                f = true;
            else if (arr[i] > arr[i + 1] && arr[i + 1] <= arr[0]) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (arr[j] <= arr[j + 1] && arr[j] <= arr[0] && arr[j + 1] <= arr[0])
                        f = true;
                    else
                        return false;
                }
            } else {
                return false;
            }

        }
        return f;
    }
        public boolean check1 ( int[] arr){
            boolean f = false;
            if (arr.length <= 2)
                return true;

            int i = 1;
            int n = arr.length;
            while (i < n && arr[i] >= arr[i - 1]) {
                i++;
            }
            if (i == n)
                return true;
            if (arr[i] > arr[0])
                return false;
            if (i == n - 1)
                return true;
            i = i + 1;
            while (i < n && arr[i] >= arr[i - 1] && arr[i] <= arr[0]) {
                i++;
            }

            return i == n;
        }

    }

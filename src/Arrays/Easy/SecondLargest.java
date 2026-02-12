package Arrays.Easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secLargest(arr));
        System.out.println(secSmallest(arr));
    }

    public static int secLargest(int[] arr){
        if(arr.length<2)
            return -1;

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i])
                {
                    secLargest=largest;
                    largest=arr[i];
                }
                else if (secLargest<arr[i]&& arr[i]!=largest)
                    secLargest=arr[i];
            }
        // Check if second largest was found
        return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
    }

    public static int secSmallest(int[] arr){
        if(arr.length<2)
            return -1;
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest)
            {
                secSmall=smallest;
                smallest=arr[i];
            } else if (arr[i] < secSmall && arr[i] != smallest)
                secSmall=arr[i];
        }
        // Check if second smallest was found
        return (secSmall == Integer.MAX_VALUE) ? -1 : secSmall;
    }
}

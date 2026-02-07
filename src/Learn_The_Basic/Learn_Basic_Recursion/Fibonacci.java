package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println(fibonacci2(num));
    }

    public static int fibonacci(int num) {
        if (num <= 1)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int fibonacci2(int num) {
        if(num<=1)
            return num;
        int a = 0;
        int b = 1;
        for(int i = 1;i<=num;i++){
            b = a+b;
            a = b-a;

        }
        return a;
    }
}
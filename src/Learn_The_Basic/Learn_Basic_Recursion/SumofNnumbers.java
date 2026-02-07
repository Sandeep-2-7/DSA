package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int add = 0;
//        Sum(num,add);
        System.out.println(Sum2(num));
        System.out.println(factorial(num));
    }

    public static void Sum(int num, int add){
        if(num<1){
            System.out.println(add);
            return;}
        Sum(num-1,add+num);
    }

    public static int Sum2(int num){
        if(num == 0)
            return 0;

        return num + Sum2(num-1);
    }

    public static int factorial(int num){
        if(num == 0)
            return 1;

        return num * factorial(num-1);
    }
}

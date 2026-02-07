package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class PrintNnumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
//        printing1toN(1,x);
//        printingNto1(x,1);
//        backtracking(x);
        backtracking2(1,x);
    }

    public static void printing1toN(int start, int end){
        if(start>end)
            return ;
        System.out.println(start);
        printing1toN(start+1,end);
    }

    public static void printingNto1(int start, int end){
        if(start<end)
            return ;
        System.out.println(start);
        printingNto1(start-1,end);
    }

    public static void backtracking(int num){
        if(num<1)
            return ;
        backtracking(num-1);
        System.out.println(num);
    }

    public static void backtracking2(int start,int end){
        if(start>end)
            return ;
        backtracking2(start+1,end);
        System.out.println(start);
    }

}

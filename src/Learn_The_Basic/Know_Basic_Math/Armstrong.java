package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int len = String.valueOf(x).length();
        int temp = 0;
        int count = x;
        while(x!=0){
            temp = temp + (int) Math.pow(x%10,len);
            x=x/10;
        }
        if(temp==count)
            System.out.println("Palindrome");
        else
            System.out.println("Nat Palindrome");
    }
}

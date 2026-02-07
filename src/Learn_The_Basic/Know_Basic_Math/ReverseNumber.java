package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();
//        int newNum = trimNum(num);
        int newNum = 0;
//        newNum = trimNum(newNum);
        if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE)
            newNum = reverseNum(num);
        System.out.println(newNum);
    }

    public static int trimNum(int x){
        boolean condition = true;
        //trim
        while(condition){
            if(x%10 == 0){
                x=x/10;
                continue;
            }
            condition = false;
        }
        return x;
    }

    public static int reverseNum(int x){
        int y = 0;
        //reverse
        while(x!=0){
            if(y>Integer.MAX_VALUE/10 || y<Integer.MIN_VALUE/10)
                return 0;
            y = (int)( y*10 + x%10);
            x = x/10;

        }
        return y;
    }
}

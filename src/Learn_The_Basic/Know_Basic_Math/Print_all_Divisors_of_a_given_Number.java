package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class Print_all_Divisors_of_a_given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        for(int i=1;i<=x/2;i++){
            if(x%i==0)
                System.out.print(i+" ");
        }
        System.out.print(x);
    }
}

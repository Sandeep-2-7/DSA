package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class PrimNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int count = 0;
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
                count++;
        }
        if (count==0)
            System.out.print("Prime");
        else
            System.out.print("Not Prime");
    }
}

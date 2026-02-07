package Learn_The_Basic.Learn_Basic_Recursion;

import java.util.Scanner;

public class PrintNameNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        display(name,n);
    }

    public static void display(String name, int n){
        if(n<=0)
            return ;
        System.out.println(name);
        n--;
        display(name,n);
    }
}

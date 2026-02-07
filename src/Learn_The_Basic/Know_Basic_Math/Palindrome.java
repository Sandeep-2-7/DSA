package Learn_The_Basic.Know_Basic_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        String str = String.valueOf(num);

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

        public boolean isPalindrome ( int x){
//
            int copy = x;
            int rev = 0;
            while (x > 0) {
                rev = rev * 10 + x % 10;
                x = x / 10;
            }
            if (copy == rev)
                return true;

            return false;
        }
    }
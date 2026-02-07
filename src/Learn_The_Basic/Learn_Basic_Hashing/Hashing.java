package Learn_The_Basic.Learn_Basic_Hashing;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int[] hash=new int[13];
        for(int i=0;i<len;i++){
            hash[arr[i]]++;
        }

        System.out.println("Enter the total search number");
        int search = sc.nextInt();

        while(search>0){
            System.out.println("Enter the number to be searched");
            int s = sc.nextInt();
            System.out.println(hash[s]);
            search--;
        }
    }
}

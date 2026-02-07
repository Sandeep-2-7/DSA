package Learn_The_Basic.Learn_Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freq_of_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> ss = new HashMap<Integer, Integer>();

        for(int i=0;i<n;i++){
            ss.put(arr[i], ss.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e: ss.entrySet()){
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
}

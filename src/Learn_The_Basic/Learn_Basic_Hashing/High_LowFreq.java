package Learn_The_Basic.Learn_Basic_Hashing;

import javax.naming.ldap.PagedResultsResponseControl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class High_LowFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int small = 0;
        int small_Key = 0;
        int largest = 0;
        int largest_Key = 0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

            int check = entry.getValue();
            if(small==0 && largest==0){
                small_Key=entry.getKey();
                small = entry.getValue();
                largest_Key=entry.getKey();
                largest = entry.getValue();
            }

            if(check<small) {
                small_Key = entry.getKey();
                small = entry.getValue();
            }
            if(check>largest){
                largest_Key = entry.getKey();
                largest = entry.getValue();
            }
        }
        System.out.println("Largest value is : "+largest_Key);
        System.out.println("Smallest value is : "+small_Key);
    }
}

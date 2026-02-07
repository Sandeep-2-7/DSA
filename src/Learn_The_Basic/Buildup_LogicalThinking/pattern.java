package Learn_The_Basic.Buildup_LogicalThinking;

import java.util.Scanner;
public class pattern {

    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();


//  *
//  **
//  ***
//  ****
//  *****
//        for(i=0;i<n;i++){
//            for (j=0;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        1
//        12
//        123
//        1234
//        12345
//        for (i = 0; i < n; i++) {
//            for (j = 0; j <= i; j++) {
//                System.out.print(j + 1);
//            }
//            System.out.println("");
//        }


//        1
//        22
//        333
//        4444
//        for (i=1;i<=n;i++){
//            for (j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }




//  *****
//  ****
//  ***
//  **
//  *
//        for(i=n;i>0;i--){
//            for(j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        12345
//        1234
//        123
//        12
//        1
//        for(i=n;i>0;i--){
//            for(j=0;j<i;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }






//        *
//       ***
//      *****
//     *******
//    *********
//        int temp_2 = n;
//        int temp_3 = n;
//
//        for(i=0;i<n;i++){
//            int temp_1 = (2*i)+1;
//
//
//            for(int k=1;k<temp_2;k++){
//                System.out.print(" ");
//            }
//
//            for(j=0;j<temp_1;j++){
//                System.out.print("*");
//            }
//
//            for(int k=1;k<temp_3;k++){
//            System.out.print(" ");
//            }
//
//            temp_3--;
//            temp_2--;
//            System.out.println();
//        }


//  **********
//  ****  ****
//  ***    ***
//  **      **
//  *        *
//  *        *
//  **      **
//  ***    ***
//  ****  ****
//  **********
//
//        for(i=1;i<=n;i++){
//
//            //stars
//            for(j=1;j<=(n-i+1);j++){
//                System.out.print("*");
//            }
//
//            //space
//            for(j=1;j<=(i-1)*2;j++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(j=1;j<=(n-i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        for(i=1;i<=n;i++){
//
//            //stars
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            //space
//            for(j=1;j<=(n-i)*2;j++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



//  *        *
//  **      **
//  ***    ***
//  ****  ****
//  **********
//  ****  ****
//  ***    ***
//  **      **
//  *        *
//        for(i=1;i<=n;i++){
//
//            //stars
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            //space
//            for(j=1;j<=(n-i)*2;j++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        for(i=1;i<n;i++){
//
//            //stars
//            for(j=1;j<=(n-i);j++){
//                System.out.print("*");
//            }
//
//            //space
//            for(j=1;j<=(i)*2;j++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(j=1;j<=(n-i);j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *

//        for(i=1;i<=n;i++){
//            for(j=1;j<=n;j++){
//                if(i==1 || i==n)
//                    System.out.print("* ");
//                else if(j==1 || j==n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println("");
//        }



//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
//        for(i=1;i<=(n*2)-1;i++){
//            for(j=1;j<=(n*2)-1;j++) {
//                int top = i;
//                int left = j;
//                int bottom = (n*2) - i;
//                int right = (n*2) - j;
//                System.out.print(n + 1 - Math.min(Math.min(top,bottom), Math.min(left,right))+" ");
//            }
//            System.out.println("");
//        }


    }
}

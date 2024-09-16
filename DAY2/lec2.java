// WAP to Print First N Natural numbers in Reverse order

import java.util.Scanner;
public class lec2 {
   
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=n;i>0;i--){
        //     System.out.println(i);      //with for loop
        // }
        int i=0;
        while(i<n){
            System.out.println(n);         //with while loop
            n--;
        }

    }
}

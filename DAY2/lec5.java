package DAY2;

//sum of odd places and even places
import java.util.*;
import java.util.scanner;
public class lec5  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();        //2  6  3  5      11  5
        
        int odd=0;
        int even=0;
       
        while (n!=0){
            int x= n%10;
            odd=odd+x;
            n=n/10;
            x=n%10;
            even=even+x;
        }
        System.out.println(odd);
        System.out.println(even);




    }
}
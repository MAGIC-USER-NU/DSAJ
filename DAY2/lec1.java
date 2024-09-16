//wap to check if no is prime or not
package DAY2;
import java.util.Scanner;
public class lec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
            c++;
        }
        if(c>0){
            System.out.println("no is not prime");
        }else{
            System.out.println("no is prime");
        
        }
    }
        
}


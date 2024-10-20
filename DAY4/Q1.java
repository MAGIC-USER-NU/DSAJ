//create a function of a armstrong no
package DAY4;
import java.util.Scanner;
public class Q1 {
    public class Do(){
        
        static void arms(int n){
            int t=n;
            int c=0;
            int sum=0;
            while(t!=0){
                int r=t%10;
                c++;
                t=t/10;
            }
            for(int i=1;i<=n;i++){
                int x=n%10;
                for(int y=1;y<=c;y++){
                    int z=x*x;
                }
                sum=sum+(z);   
            }
            if(sum==n){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }



    }
    public static void main(String[] args){                         // if armstrong 1   if no 0
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printarms();
        


        


        






    }
}

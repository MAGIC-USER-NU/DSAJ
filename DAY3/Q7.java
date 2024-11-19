package DAY3;
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		for(int i=1;i<n/2;i++){
			System.out.print("*");
			for(int j=1;j<=(n/2)-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(n/2)+1;j++){
				System.out.print("*");
			}
			System.out.println();

		}


    }
}

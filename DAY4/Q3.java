package DAY4;

public class Q3 {
    static void rev(int n){
        int sum=0;
        while (n!=0){
            int s=n%10;
            sum=sum+(s*10);
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n=12345;
        printrev(n);
    
}

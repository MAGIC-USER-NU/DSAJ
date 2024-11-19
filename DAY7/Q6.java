package DAY7;
public class Q6 {
    public static int[] NSEL(int[] arr){
        int[] Nsel =new int[arr.length];
        int ME=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            Nsel[i]=ME;
            ME=Math.min(ME,arr[i]);

        }
        return Nsel;
    }
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,3,4,1,2};
        int[] x= NSEL(arr);
        display(x);
       
    }
}

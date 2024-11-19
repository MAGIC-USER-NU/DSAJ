package DAY7;
public class Q4 {
    public static int[] NGEL(int[] arr){
        int[] Ngel =new int[arr.length];
        int ME=0;
        for(int i=0;i<=arr.length-1;i++){
            Ngel[i]=ME;
            ME=Math.max(ME,arr[i]);

        }
        return Ngel;
    }
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,1,2,4,3};
        int[] x= NGEL(arr);
        display(x);
       
    }
}

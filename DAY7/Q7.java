package DAY7;
public class Q7 {
    public static int[] NSER(int[] arr){         //greatest
        int[] Nser =new int[arr.length];
        int ME=100;
        for(int i=arr.length-1;i>=0;i--){
            Nser[i]=ME;
            ME=Math.min(ME,arr[i]);

        }
        return Nser;
    }

    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,3,4,1,2};
        int[] x= NSER(arr);
        display(x);
       
    }
}

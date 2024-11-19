package DAY7;
public class Q8 {
    public static int[] NGER(int[] arr){
        int[] Nger =new int[arr.length];
        int ME=Nger[0];
        for(int i=arr.length-1;i>=0;i--){
            Nger[i]=ME;
            if(Nger[i]>ME)
            ME=Nger[i];

        }
        return Nger;
    }

    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    
    public static void main(String[] args) {
        int[] arr = {7,8,5,6,1,2,4,3};
        int[] x= NGER(arr);
        display(x);
    }
}

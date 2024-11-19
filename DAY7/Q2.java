package DAY7;
public class Q2 {
    public static void reverse(int[] arr){
        int[] x =new int[arr.length];

        for(int i=0;i<arr.length;i++){
            x[i]=arr[arr.length -i-1];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=x[i];
        }
    }
    
    public static void rotateindex(int[] arr,int k){
        int[] x =new int[arr.length];

        for(int i=0;i<k;i++){
            x[i]=arr[k -i-1];
        }
        for(int i=k;i<arr.length;i++){
            x[i]=arr[arr.length-i+k-1];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=x[i];
        } 
    } 

    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k=2;
        reverse(arr);
        rotateindex(arr,k);
        display(arr);
    }
    
}

package DAY8;

public class Q1 {
    public static boolean BINARYSEARCH (int[] arr,int num){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==num){
                return true;
            }
            else if (arr[mid] < num) {
                low = mid + 1;
                }
            else if (arr[mid] > num) {
                high = mid - 1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
        System.out.println(BINARYSEARCH(arr, 3));
        
        
    }
}

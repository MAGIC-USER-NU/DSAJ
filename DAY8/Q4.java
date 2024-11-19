package DAY8;
                              //no of elements of same 
public class Q4 {
    public static int LOWERBOUND (int[] arr,int num){
        int low = 0, high = arr.length - 1;
        int LB=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==num){
                LB=mid;
                high=mid-1;
            }
            else if (arr[mid] < num) {
                low = mid + 1;
                }
            else if (arr[mid] > num) {
                high = mid - 1;
            }
            
        }
        return LB;
    }
    
    public static int UPPERBOUND (int[] arr,int num){
        int low = 0, high = arr.length - 1;
        int ans=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if (arr[mid] < num) {
                low = mid + 1;
                }
            else if (arr[mid] > num) {
                high = mid - 1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,4,4,4};
        int x=UPPERBOUND(arr, 2);
        int y=LOWERBOUND(arr, 2);
        System.out.println(x-y);
        
        
    }
}

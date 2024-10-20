package DAY6;

public class Q1 {
    static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0) 
                currSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x=maxSubArray(arr);
        System.out.println(x);
    }
}
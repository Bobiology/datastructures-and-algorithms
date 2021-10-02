package arrays;

public class MaxAverageSubArray {
	public static void main(String[] args) {
		int[] a = {1,12,-5,-6,50,3}; 
		int k = 4;
		System.out.println(new MaxAverageSubArray().findMaxAverage(a,k));
	}
    public double findMaxAverage(int[] nums, int k) {

    	int maxSum = Integer.MIN_VALUE, sum = 0, len = nums.length;

    	for (int i = 0; i < k; i++){
    		sum += nums[i];    
        }
    	maxSum = sum;
    	for (int i = k; i < len; i++) {
    		sum =sum + nums[i] - nums[i - k];
    		if (sum > maxSum){
                maxSum = sum;
            }	
    	}
    	return (double) maxSum / k;
    }
}

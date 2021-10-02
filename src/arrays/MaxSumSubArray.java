package arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int [] a= {-1,2,3,1,-3,2};
		System.out.println(getMaxSumSubArray(a));
	}
	/**
	 * input {-1,2,3,1,-3,2}
	 * sub 1. {-1,2} =1
	 * sub 2. {2,3} =5
	 * sub 3. {3,1} =4
	 * sub 4. {1,-3} =-2
	 * sub 5. {-3,2} =-1
	 * @param b
	 * @return
	 */
	static int getMaxSumSubArray(int[] b) {
		int n=b.length;
		int max=0;
		for(int i=0;i<n-1;i++) {
			if(b[i]+b[i+1]>max) {
				max = b[i]+b[i+1];
			}
			
		}
		
		return max;
	}
}

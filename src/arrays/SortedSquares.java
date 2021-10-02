package arrays;

import java.util.Arrays;

public class SortedSquares {
public static void main(String[] args) {
	int[] nums = {-4,-1,0,3,10};
	System.out.println(Arrays.toString(sortedSquares(nums)));;
}
	static int[] sortedSquaresd(int [] num) {
		int n =num.length;
		int[] newNum = new int[n];
		for(int i=0;i<n;i++) {
			newNum[i]=num[i]*num[i];
			Arrays.sort(newNum);
		}
		System.gc();
		return newNum;
	}
	private static boolean isNegative(int i) {
		boolean isNegative = false;
		if(i<0) {
			isNegative=  true;
		}
		return isNegative;
	}
	//Optimised code
    public static int[] sortedSquares(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
        Arrays.sort(nums);
        System.gc();
		return nums;
    }
}

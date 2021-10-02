package arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		new RotateArray().rotate(nums, k);

	}
/**
 * input     ={1,2,3,4,5,6,7},k=3
 * output k1 ={7,1,2,3,4,5,6},k=2
 * output k2 ={6,7,1,2,3,4,5},k=1
 * output k3 ={5,6,7,1,2,3,4}
 * 
 * 
 * @param nums
 * @param k
 */
	void rotate(int[] nums, int k) {
		//Rotate the given array by n times toward right
		int n = nums.length;
		int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	    	System.out.println("(i + k)="+(i + k)+" nums.length="+n+" (i + k) % nums.length="+(i + k) % n);
	      a[(i + k) % n] = nums[i];
	    }
	    for (int i = 0; i < n; i++) {
	      nums[i] = a[i];
	    }
		System.out.println("Arrays: "+Arrays.toString(a));
		
	}

}

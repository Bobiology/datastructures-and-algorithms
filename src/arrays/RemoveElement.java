package arrays;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arrs = {0,1,2,2,3,0,4,2};
		int n=2;
		System.out.println(removeElement(arrs,n));
	}
    static int removeElement(int[] nums, int val) {
        int n=nums.length, count=0;
        int temp=494999444;
        for(int i=1; i<n-1;i++){
            if(i>0 && nums[i] !=nums[i+1] && nums[i]==val){
               temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;  
            }else {
            	System.out.println("Else: "+nums[i]);
            	//i--;
            }
            if(nums[i] !=val) {
            	count++;
            }
        }
        System.out.println("Count: "+count);
        //nums = new int[n-count];
        System.out.println("Array: "+Arrays.toString(nums));
        return n-count;
    }
}

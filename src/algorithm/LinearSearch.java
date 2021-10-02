package algorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int t=15;
		//System.out.println(new LinearSearch().linearSearch(nums,t));
		System.out.println(new LinearSearch().binarySearch(nums,t));
		int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = new LinearSearch().recursiveBinarySearch(arr, 0, n - 1, x);
        System.out.println("recursive result: "+result);
		
	}
	/**
	 * O(n)
	 * @param nums
	 * @param target
	 * @return index
	 */
	int linearSearch(int[] nums, int target) {
		int index=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				index=i;
			}
		}
		return index;
	}
	int binarySearch(int[]nums,int target) {
		int index=-1,first=0,midpoint=0, last=nums.length-1;
		while(first<=last) {
			midpoint = (first+last)/2;
			if(nums[midpoint]==target) {
				return midpoint;
			}else if(nums[midpoint]<target) {
				first=midpoint+1;
			}else {
				last=midpoint-1;
			}
		}
		
		return index=-1;
	}
	int recursiveBinarySearch(int[] nums, int first,int last,int target) {
		//Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices.
        if (last >= first && first<nums.length-1) {
           
            int mid = first + (last - first) / 2;
 
            // If the element is present
            // at the middle itself
            if (nums[mid] == target)
                return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (nums[mid] > target)
                return recursiveBinarySearch(nums, first, mid - 1, target);
 
            // Else the element can only be present in right
            // subarray
            return recursiveBinarySearch(nums, mid + 1, last, target);
        }
 
        // We reach here when element is not present in array
        return -1;
	}
}

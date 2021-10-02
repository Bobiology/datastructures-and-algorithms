package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IndicesOfElementsAddingToTarget {
public static void main(String[] args) {
	int[] nums = {2,7,11,15};
	int target =17;
	System.out.println(Arrays.toString(new IndicesOfElementsAddingToTarget().twoSum(nums, target)));
}
public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    int n= nums.length;
    Map<Integer,Integer> valueHolder = new HashMap<>();
    for(int i=0;i<n; i++){
        valueHolder.put(nums[i],i);
    }
    for(int j=0;j<n;j++){
    	int index = valueHolder.getOrDefault(target - nums[j],-1);
    	if(index !=-1 && j !=index) {
    		result[0]=index;
    		result[1]=j;
    	}
    }
    return result;
}
}

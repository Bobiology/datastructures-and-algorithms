package arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class SubArraysAddingToTarget {
public static void main(String[] args) {
	int[] arr= {1,7,4,3,1,2,1,5,1};
	int target=7;
	System.out.println(Arrays.toString(getSubArrays(arr,target).toArray()));
}
/**
 * input ={1,7,4,3,1,2,1,5,1}
 * target =7
 * output ={4,3},{3,1,1,2},{5,1,1},{5,2},{4,2,1}
 * 
 * @param arr
 * @param t
 * @return
 */
static LinkedList<String> getSubArrays(int[] arr, int t) {
	int n=arr.length;
	int sum =0;
	int count=1;
	int[] newArr=new int[n];
	LinkedList<String> finalList=new LinkedList<>();
	/*for(int i=0;i<n;i++) {
		if(sum==t) {
			finalList.add(newArr.toString());
			System.out.println("newArr: "+Arrays.toString(newArr)+" sum: "+sum);
			sum=0;
		}
		else if (sum<t)
		 {
			newArr[i]=arr[i];
			sum=sum+arr[i];
			finalList.add(newArr.toString());
		}else {
			sum=arr[i+1];
		}
	}*/
	int i=0;
	while(i<n) {
		if(sum==t) {
			finalList.add(newArr.toString());
			System.out.println("newArr: "+Arrays.toString(newArr)+" sum: "+sum);
			sum=0;
		}
		else if (sum<t)
		 {
			newArr[i]=arr[i];
			sum=sum+arr[i];
			finalList.add(newArr.toString());
		}else {
			i++;
			sum=arr[i];
		}
		i++;
	}
	
	
	return finalList;
}



}

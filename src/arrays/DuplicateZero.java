package arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZero {
	public static void main(String[] args) {
		int[] arr= {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}

	static void duplicateZerosd(int[] arr) {
		 Queue<Integer> q = new LinkedList<>();
		    for(int i=0; i<arr.length; i++){
		        q.add(arr[i]);
		        if(arr[i] == 0)
		            q.add(0);
		        
		        arr[i] = q.remove();
		    }
		    System.out.println("Duplicate zeros: "+Arrays.toString(arr));
		    System.gc();
	}
	static void duplicateZeros(int[] arr) {
		int n=arr.length;
		int[] a=arr.clone();
		int pointer =0;
		int flag=0;
		int c=0;
		System.out.println("original="+Arrays.toString(arr));
		for(int i=0;i<n-1;i++) {
			//System.out.println("i="+i+" value="+arr[i]);
			if(arr[i]==0 && flag==0) {
				for(int j=i;j>0;j--) {
					System.out.println("i="+i+" value i="+arr[i]+" j="+j+" value j"+arr[j]);
					a[j+1]=arr[j];
				}
		}
		System.out.println("Array: "+Arrays.toString(a));
	}
	}
}

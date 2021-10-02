package arrays;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 2, 5, 6, 0, 0, 0 }, nums2 = { 1, 2, 3 };
		int m = 3, n = 3;
		System.out.println(Arrays.toString(mergeDD(nums1, m, nums2, n)));
	}

	/**
	 * input {1,2,3,0,0,0} m=3, {2,5,6} n=3 arr1 {1,2,3} arr2 {2,5,6} newArr
	 * {1,2,3,2,5,6} final {1,2,2,3,5,6}
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] mergedArr = new int[m + n];
		int c = 0;
		// nums1 = new int[m+n];
		for (int j = 0; j < m; j++) {
			mergedArr[j] = nums1[j];
			c++;
		}
		for (int i = 0; i < n; i++) {
			mergedArr[c + i] = nums2[i];
		}

		Arrays.sort(mergedArr);
		nums1 = new int[m + n];
		nums1 = mergedArr;
		System.gc();
		System.out.println("mergedArr: " + Arrays.toString(nums1));
	}

	static void merge2(int[] nums1, int m, int[] nums2, int n) {
		int[] mergedArr = new int[m + n];
		int b = 0;
		int j = 0, i = 0;
		while (i < n && j < m) {
			if (nums1[j] < nums2[i]) {
				nums1[b++] = nums1[j++];
			} else {
				nums1[b++] = nums2[i++];
			}
		}
		while (i < n) {
			nums1[b++] = nums2[i++];
		}
		while (j < m) {
			nums1[b++] = nums1[j++];
		}
		n++;
		System.gc();
		System.out.println("mergedArr: " + Arrays.toString(nums1));
	}

	static int[] mergeSorter(int[] nums1, int m, int[] nums2, int n) {
		/*
		 * nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 nums2 = {m ->(nums2[i])
		 * < nums1[m-1]} holder = nums1[m] nums1[m-1] = nums2[i] nums1[m] = holder
		 * 
		 * nums1[m] = nums2[i] n1 {1,2,3}, n2 {1,3,4,5}
		 */
		for (int i = 0; i < n; i++) {
			nums1[m] = nums2[i];
			if (m > 0 && n > 0 && nums2[i] <= nums1[i]) {
				nums1[m] = nums1[i];
				nums1[i] = nums2[i];
			}
			m++;
		}
		Arrays.sort(nums1);
		return nums1;
	}

	public static int[] mergeDD(int[] nums1, int m, int[] nums2, int n) {
		// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		// Output: [1,2,2,3,5,6]
		int longArryLen = nums1.length;
		m--; // data inside array a
		n--; // length of array b
		longArryLen--;
		/*
		 * 1.I will loop loop array nums1 from right to left (nums1 length --) while
		 * length of array nums2 >= 0 2.I will compare index m in array A with index n
		 * in array B 3.If value of index m is greater tha value of index B then I
		 * insert that value in array A in position longArryLen -- 4. Else I will insert
		 * the value in array B in position longArryLen -- 5, If value in index m in
		 * Array A == value in index n in Array B then I I will insert the value in
		 * array B in position longArryLen --
		 */
		while (longArryLen >= 0 && n >= 0) {
			if (m >= 0 && nums1[m] > nums2[n]) {
				nums1[longArryLen--] = nums1[m--];
			} else {
				nums1[longArryLen--] = nums2[n--];
			}
		}
		return nums1;
	}

}

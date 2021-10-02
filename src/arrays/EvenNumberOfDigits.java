package arrays;

public class EvenNumberOfDigits {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		int num = 499;
		System.out.println("Even count: " + evenNumberOfDigits(nums));
		System.out.println("digits: "+countOfDigits(num));
	}

	/**
	 * nums = {12,345,2,6,7896} 12 ={1,2} - >2 even 345 ={3,4,5} ->3 odd 2 ={2} -> 1
	 * odd 6 ={6} -> 1 odd 7896 ={7,8,9,6} ->4 even total even =2
	 * 
	 * @param nums
	 * @return count
	 */
	static int findNumbers(int[] nums) {

		int n = nums.length;
		String num = null;
		char[] ch = null;
		int count = 0;
		if (n <= 500 && n > 0) {
			for (int i = 0; i < n; i++) {
				num = nums[i] + "";
				ch = new char[num.length()];
				if (ch.length % 2 == 0) {
					count++;
				}
			}
		}
		return count;

	}
	static int countOfDigits(int num) {
		int length = 0;
		long temp = 1;
		while (temp <= num) {
		    length++;
		    temp *= 10;
		}
		return length;
	}
	//Optimized solution
	static int evenNumberOfDigits(int [] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(9< nums[i] && nums[i]<100|| 999<nums[i] && nums[i]<10000 || nums[i]==100000){
				count++;
			}
		}
		
		return count;
	}

}

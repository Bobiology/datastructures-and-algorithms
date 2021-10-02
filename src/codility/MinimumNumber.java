package codility;

import java.math.BigInteger;

public class MinimumNumber {

	public static void main(String[] args) {
		int a = 70;

		System.out.println(getMinNumber(a));

	}

	static int getMinNumber(int n) {
		int count = 0;
		if (n <= 9) {
			return 0;
		} else {
			while (n != 0) {
				n = n / 10;
				++count;
			}
		}
		return (int) Math.pow(10, count - 1);
	}

}

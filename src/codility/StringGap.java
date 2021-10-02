package codility;

public class StringGap {

	public static void main(String[] args) {
		System.out.println(BinaryGap("011100"));
	}

	public static int BinaryGap(String S) {
		// write your code in Java SE 8
		// odd ends in 1
		// Even ends in 0
		// 8=1000, 4 = 100
		// binary rep of 0 = 0
		int operations = 0;
		while (S.contains("1")) {
			if (S.endsWith("0")) { // even numbers
				S = S.substring(0, S.length() - 1); // remove the last 0
			} else {
				S = new StringBuilder(S.substring(0, S.length() - 1)).append("0").toString();
			}
			operations++;
		}
		return operations;
	}
}

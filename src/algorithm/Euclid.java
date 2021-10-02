package algorithm;

//GCD
public class Euclid {
	public static void main(String[] args) {
		int a = 21, b = 9;
		System.out.println("GCD=" + gcd(a, b));
	}

	static int gcd(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a | b;
	}
}

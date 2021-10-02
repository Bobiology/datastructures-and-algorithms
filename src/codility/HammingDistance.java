package codility;

public class HammingDistance {

	public static void main(String[] args) {
		int a =10, b=15;
		System.out.println(new HammingDistance().hammingDistance(a,b));
	}
    public int hammingDistance(int x, int y) {
        int number = x ^ y;
        int countOfSetBits = 0;
        while (number != 0) {
            countOfSetBits += number & 1;
            number = number >> 1;
        }
        return countOfSetBits;
    }
}

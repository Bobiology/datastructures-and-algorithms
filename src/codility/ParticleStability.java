package codility;

public class ParticleStability {

	public static void main(String[] args) {
		int[] A = { -1, 1, 3, 3, 3, 2, 3, 2, 1, 0 };
		System.out.println(new ParticleStability().getCount(A));
	}

	public int getCount(int[] A) {
		int n = A.length, count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; i + 2 < n && A[i + 1] - A[i] == A[i + 2] - A[i + 1]; i++) {
				j++;
				count += j;
			}
		}
		return count;
	}
}

package codility;

public class SuperPalindromes {
	public static void main(String[] args) {
		String l = "40000", r = "50000";
		SuperPalindromes sp = new SuperPalindromes();
		System.out.println(sp.superpalindromesInRange(l, r));
	}
/*
	public int superpalindromesInRange(String left, String right) {

		int counter = 0;
		int l = Integer.parseInt(left);
		int r = Integer.parseInt(right);
		for (int i = l; i < r; i++) {
			int sr = (int) Math.sqrt(i);
			int length = String.valueOf(i).length();
			if (i < 10 && (sr * sr) == i) {
				counter++;
			}
			if (i > 9 && (sr * sr) == i && isMatch(length, i, 1, 1)) {
				int len = String.valueOf(sr).length();
				if (isMatch(len, sr, 1, 1)) {
					counter++;
				} else if (isMatch(len, sr, 0, 0)) {
					counter++;
				}

			} else if (i > 9 && (sr * sr) == i && isMatch(length, i, 0, 0)) {
				int len = String.valueOf(sr).length();
				if (isMatch(len, sr, 1, 1)) {
					counter++;
				} else if (isMatch(len, sr, 0, 0)) {
					counter++;
				}
			}
		}

		return counter;
	}

	boolean isMatch(int len, int sr, int offset, int evenOdd) {
		boolean match = false;
		if (len % 2 == evenOdd && String.valueOf(sr).substring(0, len / 2)
				.equals(String.valueOf(sr).substring((len / 2) + offset, len))) {
			match = true;
		}
		return match;
	}
*/
	
	public int superpalindromesInRange(String left, String right) {
        int from = (int) Math.ceil(Math.sqrt(Long.parseLong(left))), to = (int) Math.sqrt(Long.parseLong(right)), count = 0;
        for(int p = next(from - 1); p <= to; p = next(p)) {
            if(isPalindrome((long) p * p)) {
                count++;
            }
        }
        return count;
    }
    private int next(int num) {
        char[] s = String.valueOf(num + 1).toCharArray();
        for(int i = 0, n = s.length; i < (n >> 1); i++) {
            while(s[i] != s[n - 1 - i]) {
                increment(s, n - 1 - i);
            }
        }
        return Integer.parseInt(new String(s));
    }
    private void increment(char[] s, int i) {
        while(s[i] == '9') s[i--] = '0';
        s[i]++;
    }
    private boolean isPalindrome(long n) {
        long orig = n, rev = 0;
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return orig == rev;
    }
}

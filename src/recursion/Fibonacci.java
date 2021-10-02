package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("recursion: " + new Fibonacci().fib(n));
		System.out.println("loop: " + new Fibonacci().fibonacci(n));
		System.out.println("top-bottom: " + new Fibonacci().CalculateFibonacci(n));
		
	}

	int fib(int n) {

		if (n >= 0) {
			return fib(n - 1) + fib(n - 2);
		} else {
			return 1;
		}
	}

	int fibonacci(int n) {
		int fibo = 1;
		while (n >= 3) {
			fibo = (n - 1) + (n - 2);
			n -= 2;
		}
		return fibo;
	}
	
	public int CalculateFibonacci(int n) {
	    if (n==0) return 0;
	    int dp[] = new int[n+1];

	    //base cases
	    dp[0] = 0;
	    dp[1] = 1;

	    for(int i=2; i<=n; i++)
	      dp[i] = dp[i-1] + dp[i-2];

	    return dp[n];
	  }
}

package recursion;

public class Factorial {
public static void main(String[] args) {
	int n=9;
	System.out.println("recursion: "+new Factorial().factorial(n));
	System.out.println("loop: "+new Factorial().fact(n));
}
/**
 * input : n=9
 * compu: n*(n-1)*...*1 => 9*8*7*6*5*4*3*2*1
 * @param n
 * @return
 */
//recursive
 int factorial(int n) {
	 if(n>=1) {
		 return n * factorial(n-1);
	 }else {
		 return 1;
	 }
 }
 //loop
 int fact(int n) {
	 int factor=1;
	 while(n>0) {
		 factor= n*factor;
		 n--;
	 }
	 return factor;
 }
 
}

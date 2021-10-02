package codility;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int first =15;
	int second=23;
	System.out.println("----- before swap -----");
	System.out.println("First Number: "+first+" Second Number: "+second);
	first = first-second;
	second = first+second;
	first = second-first;
	
	System.out.println("----- after swap -----");
	System.out.println("First Number: "+first+" Second Number: "+second);
	
	
}
}

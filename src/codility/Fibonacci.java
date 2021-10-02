package codility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fibonacci {
	public static void main(String[] args) {
		int f50th=50;
		//new Fibonacci().fibonacci(f50th);
		new Fibonacci().stringTest();
	}
	
	void fibonacci(int n) {
		n=n-2;
		float first=0,sec=1;
		float fibo=0;
		System.out.println("i=1-->"+first);
		System.out.println("i=2-->"+sec);
		for(int i=2;i<n;i++) {
			fibo=first+sec;
			System.out.println("i="+i+"-->"+fibo);
			first=sec;
			sec=fibo;
			//n-=1;
		}
	}
	void stringTest() {
		List<String>tzStaffAccSubSegment= new ArrayList<>();
		String tzAccSubSeg = "1000^2000";
		String[] tzAccSubSList = tzAccSubSeg.split("\\^");
		System.out.println("0="+tzAccSubSList[0]);
		System.out.println("1="+tzAccSubSList[1]);
		for(int i=0;i<tzAccSubSList.length;i++) {
			tzStaffAccSubSegment.add(tzAccSubSList[i]);
		}
		
		
		System.out.println(tzStaffAccSubSegment.contains("2000"));
	}

}

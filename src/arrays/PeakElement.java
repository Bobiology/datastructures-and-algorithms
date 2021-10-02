package arrays;

import java.util.HashMap;
import java.util.Map;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;

public class PeakElement {
	public static void main(String[] args) {
		int[] num = {10, 20, 15, 2, 23, 90, 67};
		System.out.println(findPeak(num));
		//System.out.println(findPeaker(num));
	}
	
	//Brute-force
	static Map findPeak(int[] num) {
	Map<Integer,Integer> peaks = new HashMap<>();
		int n=num.length;
		if(n==1) {
			peaks.put(n, num[n]);
		}
		if (num[n - 1] >= num[n - 2]) {
			peaks.put(n - 1, num[n-1]);
		}
		for(int i=1;i<n-1;i++) {
			if(num[i]>=num[i-1] && num[i]>=num[i+1]) {
				peaks.put(i, num[i]);
			}
		}
		return peaks;
	}
	//divide and conquer
	static Map findPeaker(int[] num) {
		
		return null;
		
	}
}

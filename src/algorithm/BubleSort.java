package algorithm;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int[] a = {10,2,8,6,7,9,1,3,5,4};
		System.out.println(Arrays.toString(sort(a)));
	}

	static int[] sort(int[] a) {
		int holder=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					holder=a[j];
					a[j]=a[i];
					a[i]=holder;
				}
			}		}
		return a;
	}
	static int[] b(int v, int[] a, int holder) {
		for(int j=0;j<a.length;j++) {
			if(v<a[j]) {
				holder=a[j];
				a[j]=v;
				v=holder;
			}
		}
		return a;
	}
}

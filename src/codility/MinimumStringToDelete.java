package codility;

import java.util.Arrays;

public class MinimumStringToDelete {
	public static void main(String[] args) {
		String S = "ccaaffddecee";
		System.out.println(getCount(S));
	}

	static int getCount(String S) {
		// write your code in Java SE 8
        int[] frequency = new int[26];
        for(int i=0;i<S.length();i++){
            frequency[S.charAt(i) - 'a']++;
        }
        //not very optimal
        Arrays.sort(frequency);
        //
        int maxIndex = frequency.length - 1;
        int count = 0;
        for(int i=maxIndex; i>0; i--){
          if(frequency[i-1] >= frequency[i]){
              while(frequency[i-1] != 0 &&
              frequency[i] <= frequency[i-1]){
             frequency[i-1]--;
             count++;
              }
          }
        }
        return count;
	}
}

/**
 * 
 */
package hackerRank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sakawaelijahbob
 *
 */
public class MariaScores {

	public static void main(String[] args) {

		List<Integer> scores = new ArrayList<>();
		scores.add(3);scores.add(4);scores.add(21);scores.add(36);scores.add(10);scores.add(28);scores.add(35);scores.add(5);scores.add(24);scores.add(42);
		//scores.add(10);scores.add(5);scores.add(20);scores.add(20);scores.add(4);scores.add(5);scores.add(2);scores.add(25);scores.add(1);

		System.out.println(breakingRecords(scores));
	}
	/**
	 * input = {10,5,20,20,4,5,2,25,1}
	 * input2 = {3,4,21,36,10,28,35,5,24,42}
	 * 
	 * output = {2,4} ==>[break, fail]
	 * @param scores
	 * @return
	 */
	public static List<Integer> breakingRecords(List<Integer> scores) {
		int failCount=0;
		int sucessCount=0;
		int highestScore=scores.get(0);
		int lowestScore=scores.get(0);
		
		for(int i=1; i<scores.size();i++) {
			int prev=scores.get(i-1);
			if(prev>scores.get(i) && lowestScore>scores.get(i)) {
				
				failCount++;
				System.out.println("PREV="+prev+" CURR="+scores.get(i)+" FAIL COUNT="+failCount+" GAME="+i);
				lowestScore=scores.get(i);
				
			}
			if(prev<scores.get(i) && highestScore<scores.get(i)) {
				sucessCount++;
				System.out.println("PREV="+prev+" CURR="+scores.get(i)+" BREAK COUNT="+sucessCount+" GAME="+i);
				highestScore=scores.get(i);
			}
		}
		scores = new ArrayList<>();
		scores.add(sucessCount);
		scores.add(failCount);
		return scores;
	    }


}

package arrays;

import java.util.Random;

public class WordPuzzle {
	public static void main(String[] args) {
		String[] puzzle={"NFROLBOBDN"};
		String letters="BOB";
		wordPUzzle(puzzle,letters);
		//getWordPuzzle();
		
	}

	public static void getWordPuzzle() {
		Random rand = new Random();
        int num = rand.nextInt(26);
        char ch = (char)('A' - num);
        System.out.println("char = " + ch);
	}
	
	public static void wordPUzzle(String[] puzzle, String letters) {
        boolean over = false;
        boolean foundit = false;
        String word = new String(letters);

        for (int i = 0; (i < puzzle.length) && (!over); i++) {
            for (int j = 0; (j < puzzle[i].length()) && (!over); j++) {

                // Use (i,j) as the starting point.
                foundit = true;

                // Look through each letter in word
                for (int k = 0; (k < letters.length()) && (foundit); k++) {
                    if ((j + k >= puzzle[i].length())
                    		//|| (letters[k] != puzzle[i][j + k])
                    		) {
                        // It didn't Match
                        foundit = false;
                    }
                }
                // Success if we made it through all the characters
                if (foundit) {
                    System.out.println(word + " found in row=" + i
                            + " col=" + j);
                    over = true;
                }

            }
        }

        if (!foundit) {
            System.out.println(word + " not found");
        }
	}
}

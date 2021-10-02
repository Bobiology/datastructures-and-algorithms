package trie;

//Java implementation of search and insert operations on Trie
public class TrieImp {
	// Alphabet size (# of symbols)
	static final int ALPHABET_SIZE = 26;
	// trie node
	static class TrieNode
	{
		TrieNode[] kids = new TrieNode[ALPHABET_SIZE];
		// isEndOfWord is true if the node represents
		// end of a word
		boolean isEndOfWord;
		TrieNode(){
			isEndOfWord = false;
			for (int i = 0; i < ALPHABET_SIZE; i++) {
				kids[i] = null;
			}
				
		}
	}
	static TrieNode root;
	// If not present, inserts key into trie
	// If the key is prefix of trie node,
	// just marks leaf node
	static void insert(String key)
	{
		int length = key.length();
		int index;
	
		TrieNode node = root;
	
		for (int i = 0; i < length; i++)
		{
			index = key.charAt(i) - 'a';
			if (node.kids[index] == null) {
				node.kids[index] = new TrieNode();
			}
			node = node.kids[index];
		}
		// mark last node as leaf
		node.isEndOfWord = true;
	}
	// Returns true if key presents in trie, else false
	static boolean search(String key)
	{
		int length = key.length();
		int index;
		TrieNode node = root;
	
		for (int i = 0; i < length; i++)
		{
			index = key.charAt(i) - 'a';
			if (node.kids[index] == null) {
				return false;
			}
			node = node.kids[index];
		}
		return (node != null && node.isEndOfWord);
	}
	// Driver
	public static void main(String args[])
	{
		// Input keys (use only 'a' through 'z' and lower case)
		String keys[] = {"the", "a", "there", "answer", "any","by", "bye", "their"};
		String output[] = {"Not present in trie", "Present in trie"};
	
		root = new TrieNode();
		// Construct trie
		int i;
		for (i = 0; i < keys.length ; i++)
			insert(keys[i]);
		// Search for different keys
		if(search("the") == true)
			System.out.println("the --- " + output[1]);
		else System.out.println("the --- " + output[0]);
		
		if(search("these") == true)
			System.out.println("these --- " + output[1]);
		else System.out.println("these --- " + output[0]);
		
		if(search("their") == true)
			System.out.println("their --- " + output[1]);
		else System.out.println("their --- " + output[0]);
		
		if(search("thaw") == true)
			System.out.println("thaw --- " + output[1]);
		else System.out.println("thaw --- " + output[0]);
		
	}
}
package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	private class TrieNode {
		Map<Character, TrieNode> kids;
		boolean endOfWord;

		public TrieNode() {
			kids = new HashMap<>();
			endOfWord = false;
		}
	}

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.kids.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.kids.put(ch, node);
			}
			current = node;
		}
		current.endOfWord = true;
	}

	// recursive insert
	public void insertRecursive(String word) {
		insertRecursive(root, word, 0);
	}

	private void insertRecursive(TrieNode current, String word, int index) {
		if (index == word.length()) {
			current.endOfWord = true;
			return;
		}
		char ch = word.charAt(index);
		TrieNode node = current.kids.get(ch);
		if (node == null) {
			node = new TrieNode();
			current.kids.put(ch, node);
		}
		insertRecursive(node, word, index + 1);
	}

	public boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			TrieNode node = current.kids.get(word.charAt(i));
			if (node == null) {
				return false;
			}
			current = node;
		}
		return current.endOfWord;

	}

	public void delete(String word) {
		delete(root, word, 0);
	}

	private boolean delete(TrieNode current, String word, int i) {
		if (i == word.length()) {
			if (!current.endOfWord) {
				return false;
			}
			current.endOfWord = false;

			return current.kids.size() == 0;
		}
		char ch = word.charAt(i);
		TrieNode node = current.kids.get(ch);
		if (node == null) {
			return false;
		}
		boolean shouldDeleteCurrentNode = delete(node, word, i + 1);

		if (shouldDeleteCurrentNode) {
			current.kids.remove(ch);
			return current.kids.size() == 0;
		}
		return false;
	}
}

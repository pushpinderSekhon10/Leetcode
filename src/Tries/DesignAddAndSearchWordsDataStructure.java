package Tries;

public class DesignAddAndSearchWordsDataStructure
{
    public class Node {
        private Boolean isWord;
        private Node[] child;

        public Node() {
            isWord = false;
            child = new Node[26];
        }
    }

    Node root;

    public void WordDictionary() {
        root = new Node(); // Added missing semicolon
    }

    public void addWord(String word) {
        int n = word.length();
        Node head = root;

        for (int i = 0; i < n; i++) {
            int index = word.charAt(i) - 'a';
            if (head.child[index] == null) { // Corrected condition to initialize new node if null
                head.child[index] = new Node();
            }
            head = head.child[index];
        }
        head.isWord = true;
    }

    public boolean search(String word) {
        return searchInNode(word, root, 0);
    }

    private boolean searchInNode(String word, Node node, int start) {
        Node head = node;
        for (int i = start; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') { // Handling wildcard character
                for (Node child : head.child) {
                    if (child != null && searchInNode(word, child, i + 1)) {
                        return true;
                    }
                }
                return false;
            } else {
                int index = ch - 'a';
                if (head.child[index] == null) {
                    return false;
                }
                head = head.child[index];
            }
        }
        return head.isWord;
    }
}

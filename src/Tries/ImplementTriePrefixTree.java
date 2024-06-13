package Tries;

public class ImplementTriePrefixTree
{
    public class Node
    {
        private Boolean isWord;
        private Node[] children;
        public Node()
        {
            isWord = false;
            children = new Node[26];
        }
    }
    Node root;
    public void Trie()
    {
        root = new Node();


    }

    public void insert(String word)
    {
        int n = word.length();

        Node head = root;

        for (int i =0;i<n;i++)
        {
            int index = word.charAt(i)-'a';
            if (head.children[index]==null)
            {
                head.children[index] = new Node();
            }
            head = head.children[index];
        }
        head.isWord = true;

    }

    public boolean search(String word)
    {
        Node head = root;
        int n = word.length();

        for (int i =0;i<n;i++)
        {
            int index = word.charAt(i) - 'a';

            if (head.children[index]==null)
            {
                return false;
            }
            head = head.children[index];

        }
        return head.isWord;


    }

    public boolean startsWith(String prefix)
    {
        Node head = root;
        int n = prefix.length();

        for (int i =0;i<n;i++)
        {
            int index = prefix.charAt(i)-'a';

            if (head.children[index]==null)
            {
                return false;
            }
            head = head.children[index];

        }
        return true;

    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

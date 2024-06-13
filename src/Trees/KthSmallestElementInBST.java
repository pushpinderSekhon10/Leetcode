package Trees;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class KthSmallestElementInBST
{
    /**
    public List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k)
    {
        traverse(root);
        return list.get(k-1);
    }
    public void traverse(TreeNode node)
    {
        if (node==null)
        {
            return;
        }

        traverse (node.left);
        list.add(node.val);
        traverse (node.right);
    }
     */

}

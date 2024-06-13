package Trees;

import javax.swing.tree.TreeNode;

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
public class MaximumDepthOfTree
{
    /**
    public int maxDepth(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        return check(root,0);

    }
    public int check(TreeNode root, int depth)
    {
        if (root==null)
        {
            return depth;
        }
        int l = check(root.left,depth+1);
        int r = check(root.right,depth+1);
        return (Math.max(l,r));

    }
     */
}

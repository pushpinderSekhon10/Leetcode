package Trees;

public class BalancedBinaryTree
{
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

    /**
    public boolean isBalanced(TreeNode root)
    {



        if (root ==null)
        {
            return true;
        }
        if (!isBalanced(root.left)||!isBalanced(root.right))
        {
            return false;
        }
        int left = df(root.left);
        int right = df(root.right);

        if (left>right)
        {
            right++;
            if (left==right)
            {
                return true;
            }
            return false;
        }
        else if (right>left)
        {
            left++;
            if (left==right)
            {
                return true;
            }
            return false;
        }
        else {return true;}
    }
    public int df(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        int left = df(root.left);
        int right = df(root.right);

        return Math.max(left,right)+1;
    }
     */
}

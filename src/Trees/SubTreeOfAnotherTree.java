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
public class SubTreeOfAnotherTree
{
    /**
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        if (root == null) {
            return false;
        }
        if (root.val==subRoot.val)
        {
            if (isDuplicate(root,subRoot))
            {
                return true;
            }

        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);


    }
    public boolean isDuplicate(TreeNode p, TreeNode q)
    {
        if (p==null&&q==null)
        {
            return true;
        }
        if (p==null||q==null||p.val!=q.val)
        {
            return false;
        }
        return (isDuplicate(p.left,q.left)&&isDuplicate(p.right,q.right));
    }
     */
}

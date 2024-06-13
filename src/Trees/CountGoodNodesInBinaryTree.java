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
public class CountGoodNodesInBinaryTree
{
    /**
    public int goodNodes(TreeNode root)
    {
        return countGoodNodes(root,Integer.MIN_VALUE)  ;
    }
    public int countGoodNodes(TreeNode node, int maxVal)
    {
        if (node==null)
        {
            return 0;
        }
        int good=0;
        if (node.val>=maxVal)
        {
            good = 1;
            maxVal=node.val;
        }
        good += countGoodNodes(node.left,maxVal);
        good += countGoodNodes(node.right,maxVal);
        return good;
    }
     */

}

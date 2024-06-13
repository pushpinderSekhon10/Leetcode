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
public class ConstructBSTFromPreOrderAndInOrderTraversal
{
    /**
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,0,inorder.length-1);



    }
    public TreeNode helper(int[] preoder, Map<Integer,Integer> inordermap, int preorderIndex, int inorderStart, int inorderEnd)
    {
        if (inorderStart<inorderEnd)
        {
            return null;
        }
        int rootValue = preorder[preorderIndex];
        TreeNode root = new TreeNode(rootValue);
        int inorderIndex = inorderMap.get(rootValue);

        root.left = helper(preorder,inorderMap,preorderIndex+1,InorderStart,inorderIndex-1);
        root.right = helper(preorder,inorderMap,preorderIndex + inorderIndex - inorderStart + 1, inorderIndex + 1, inorderEnd)

    }
     */
}

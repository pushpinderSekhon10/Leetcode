package Trees;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LowestCommonAncestorOfABinarySearchTree
{
    /**
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        // If either p or q is the root, then the root is the LCA
        if (root == p || root == q) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both of the above calls return Non-NULL, then one node is present in one subtree
        // and the other is present in the other subtree. So, this node is the LCA.
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, check if left subtree or right subtree is the LCA
        if (leftLCA != null) {
            return leftLCA;
        } else {
            return rightLCA;
        }
    }
     */
}

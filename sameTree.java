//Given the roots of two binary trees p and q, write a function to check if they are the same or not.

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
class Solution {

    // Given the root nodes for both the tress, check if they are identical
    // Do a tree traversal of the trees together in the same function(api)
    // If any of those nodes od not match, return false
    // If all the nodes match, then return true

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null)
        {
            if(p.val != q.val)
            {
                return false;
            }
            return (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
        }
        if(p != null && q == null)
        {
            return false;
        }
        if(p == null && q != null)
        {
            return false;
        }
        return true;
    }
}

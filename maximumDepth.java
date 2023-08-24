// Given the root of a binary tree, return its maximum depth(height).

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
    // Get the root of the tree
    // Do a tree traversal(DFS here)
    // The height of that node would be the max height of the left 
    // node and the right node incremented by 1
    //Do the same recursively, till the entire tree has been traversed

    public int maxDepth(TreeNode root) {
        if(root!=null)
        {
            return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
        }
        return 0;
    }
}

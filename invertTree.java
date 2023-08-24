// Given the root of a binary tree, invert the tree, and return its root.

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
    // Get the root node and travese the tree
    // Do a DFS traversal and swap the left and right children of the node

    public void invertNodes(TreeNode root)
    {
        if(root != null)
        {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertNodes(root.left);
            invertNodes(root.right);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        invertNodes(root);
        return root;
    }
}

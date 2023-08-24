//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    // Since it is a BST, the problem becomes much simpler
    // Lets do this recursively, if p and q are greater than the current node, then 
    // there is a possibility that there can be different ancestor than the current node,
    // so traverse the right side of the current node (p&q are greater)
    // If p & q are lesser,then traverse the left side.
    // If one of p & q is greater and the other lesser, then they are gonna be on different
    // side of the node, making the current node the LCA, so return the LCA  

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root != null) {
            if(p.val > root.val && q.val > root.val) {
                return lowestCommonAncestor(root.right, p ,q);
            }
            else if(p.val < root.val && q.val < root.val) {
                return lowestCommonAncestor(root.left, p, q);
            }
        }
        return root;
    }
}

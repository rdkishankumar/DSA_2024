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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base cases: if both are null, they are the same
        if (p == null && q == null) return true;
        
        // If one is null and the other isn't, they are not the same
        if (p == null || q == null) return false;
        
        // If the values of the current nodes are different, they are not the same
        if (p.val != q.val) return false;
        
        // Recursively compare the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

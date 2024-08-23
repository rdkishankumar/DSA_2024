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
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        // Perform a post-order traversal on tree s
        return postOrderTraversal(s, t);
    }
    
    private boolean postOrderTraversal(TreeNode s, TreeNode t) {
        if (s == null) return false;
        
        // Traverse left and right subtrees
        boolean left = postOrderTraversal(s.left, t);
        boolean right = postOrderTraversal(s.right, t);
        
        // Check if the current subtree matches t
        boolean current = isSameTree(s, t);
        
        // Return true if any of the subtrees match
        return left || right || current;
    }
    
    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}

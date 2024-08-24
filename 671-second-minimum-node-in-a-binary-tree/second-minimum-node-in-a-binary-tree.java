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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null || root.right == null) return -1;
        
        return findSecondMinimumValue(root, root.val);
    }
    
    private int findSecondMinimumValue(TreeNode node, int rootVal) {
        if (node == null) return -1;
        
        if (node.val > rootVal) return node.val;
        
        int leftVal = findSecondMinimumValue(node.left, rootVal);
        int rightVal = findSecondMinimumValue(node.right, rootVal);
        
        // If both sides have valid values, return the smaller of the two
        if (leftVal != -1 && rightVal != -1) {
            return Math.min(leftVal, rightVal);
        }
        
        // If only one side has a valid value, return that value
        return (leftVal != -1) ? leftVal : rightVal;
    }
}

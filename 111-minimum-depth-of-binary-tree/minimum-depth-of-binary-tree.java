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
    int minPath = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
       
    
         int leftPath = minDepth(root.left);
        int rightPath = minDepth(root.right);
        
       
        return (leftPath==0 || rightPath==0)?leftPath+rightPath+1:Math.min(leftPath, rightPath)+1;
        
    }
}
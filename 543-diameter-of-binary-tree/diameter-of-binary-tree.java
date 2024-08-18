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
    int maxDept = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==null) return 0;
        int leftHeight =  heightOfBinaryTree(root.left);
        int rightHeight =  heightOfBinaryTree(root.right);
    maxDept =  Math.max ( maxDept, (leftHeight+rightHeight));
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxDept;
         
    }
    
    public int heightOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
       int leftHeight =  heightOfBinaryTree(root.left);
        
        int rightHeight =  heightOfBinaryTree(root.right);
        
        return Math.max(leftHeight, rightHeight)+1;
        
    }
}
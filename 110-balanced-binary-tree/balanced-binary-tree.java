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
    public boolean isBalanced(TreeNode root) {
     
     return  HeightOfTree(root)!= -1;   
    }
    
     public int HeightOfTree(TreeNode root) {
        if(root == null) return 0;
         
         int leftHight = HeightOfTree(root.left);
         int rightHight = HeightOfTree(root.right);
         int balanceFactor = Math.abs(leftHight-rightHight);
         if(balanceFactor>1 || leftHight==-1 || rightHight == -1 ) return -1;
         return Math.max(rightHight, leftHight)+1;      
    }
}
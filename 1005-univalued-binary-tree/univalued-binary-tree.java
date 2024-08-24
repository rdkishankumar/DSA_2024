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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        
        int val = isUnivalTree(root, root.val);
        
        if(val!=-1) return true;
        
        return false;
    }
    
     public int isUnivalTree(TreeNode root, int rootVal) {
         if(root == null) return 0;
         
         if(root.val!=rootVal) return -1;
         
         int left = isUnivalTree(root.left, rootVal);
         
         int right = isUnivalTree(root.right, rootVal);
         
         if(left == -1 || right == -1) return -1;
         
         return 0;
         
    }
}
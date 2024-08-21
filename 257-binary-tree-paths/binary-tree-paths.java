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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root ==null) return result;
        binaryTreePathsHelper(root, "", result);
        return result;
        
    }
    public void binaryTreePathsHelper(TreeNode root, String path, List<String> result) {
        if(root.left ==null && root.right==null) result.add(path+root.val);
        
        if(root.left!=null){
            binaryTreePathsHelper(root.left, path+root.val+"->", result);
        }
        
        if(root.right!=null){
            binaryTreePathsHelper(root.right, path+root.val+"->", result);
        }
        
    }
}
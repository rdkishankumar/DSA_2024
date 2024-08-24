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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inIndexMap = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            inIndexMap.put(inorder[i],i);
        }
        return buildTreeHelper(preorder, 0, preorder.length-1 , inorder, 0, inorder.length-1, inIndexMap);
        
    }
    public TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,  Map<Integer, Integer> inIndexMap) {
        if(preStart> preEnd || inStart>inEnd) return null;

    
        TreeNode root = new TreeNode(preorder[preStart]);

        int inRootIndex = inIndexMap.get(preorder[preStart]);
        int leftIndex = inRootIndex-inStart;

        root.left  = buildTreeHelper(preorder,preStart+1, preStart+leftIndex, inorder, inStart, inRootIndex-1, inIndexMap);
        root.right  = buildTreeHelper(preorder,preStart+leftIndex+1, preEnd, inorder, inRootIndex + 1, inEnd, inIndexMap);

        return root;
        
    }
}
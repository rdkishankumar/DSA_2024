class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        List<Integer> leftTrav = new ArrayList<>();
        List<Integer> rightTrav = new ArrayList<>();

        getLeft(root.left, leftTrav);
        getRight(root.right, rightTrav);

        return leftTrav.equals(rightTrav);
    }

    private void getLeft(TreeNode root, List<Integer> leftTrav) {
        if (root == null) {
            leftTrav.add(null);  // Add a placeholder for null to ensure structure is preserved
            return;
        }

        leftTrav.add(root.val);
        getLeft(root.left, leftTrav);
        getLeft(root.right, leftTrav);
    }

    private void getRight(TreeNode root, List<Integer> rightTrav) {
        if (root == null) {
            rightTrav.add(null);  // Add a placeholder for null to ensure structure is preserved
            return;
        }

        rightTrav.add(root.val);
        getRight(root.right, rightTrav); // Notice the order is reversed compared to getLeft
        getRight(root.left, rightTrav);
    }
}

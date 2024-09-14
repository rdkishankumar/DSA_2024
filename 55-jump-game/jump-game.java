class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        int n = nums.length - 1;
        for (int index = 0; index <= n; index++) {
            if (index > maxJump)
                return false;
            else if (index == n)
                return true;
            maxJump = Math.max(maxJump, nums[index] + index);
        }
        return true;
    }
}
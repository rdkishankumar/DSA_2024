class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int maxZeroCount = 0;
        int result = Integer.MIN_VALUE;
        int end = 0;
        for (; end < nums.length; end++) {
            if (nums[end] == 0) {
                maxZeroCount++;
            }

            while (maxZeroCount > k) {
                if (nums[start] == 0) {
                    maxZeroCount--;
                }
                start++;
            }
            if (maxZeroCount <= k) {
                result = Math.max(result, end - start + 1);
            }
        }
        return result;

    }
}
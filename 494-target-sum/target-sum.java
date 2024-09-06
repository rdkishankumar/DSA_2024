class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrackHelper(nums, target, 0, 0); 
    }

    private int backtrackHelper(int[] nums, int target, int index, int currentSum){
        if(index == nums.length){
             return currentSum==target?1:0;
        }

    int add = backtrackHelper(nums, target, index+1, currentSum+nums[index]);
    int subtract = backtrackHelper(nums, target, index+1, currentSum-nums[index]);

    return add+subtract;
    }
}
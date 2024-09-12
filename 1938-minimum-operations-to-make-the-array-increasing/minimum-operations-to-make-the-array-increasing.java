class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;

        // Find the maximum element in the array
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] <= nums[index - 1]) {
               int increament = nums[index - 1] - nums[index] + 1;
                nums[index] += increament;
                operations+= increament;
            }
        }
        return operations;
    }
}

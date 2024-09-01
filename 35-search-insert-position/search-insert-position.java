class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        int n = nums.length;
        int result = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                result = mid;
                return result;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                result = mid;
                start = mid+1;
            }
        }
            return result+1;
    }
}
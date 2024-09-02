class Solution {
       public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;

        if(nums.length == 1 && target == nums[0]) return 0;

        int resultLeft = -1;
        int resultRight = -1;

        // Find the index of the smallest element
        int index = searchLeastIndex(nums, nums.length);

        // Search in the left half
        if(index!=-1){
            resultLeft = getIndexByBinarySearch(0, index - 1, nums, target);
        }
        // If the target is not found in the left half, search in the right half
        if(index!=-1){
            resultRight = getIndexByBinarySearch(index, n - 1, nums, target);
        }

        // Return the result
        return resultLeft!= -1?resultLeft:resultRight;
    }

    public int searchLeastIndex(int[] nums, int n) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int prev = (mid-1+n)%n;
            int next = (mid+1)%n;
            if(nums[mid]<nums[next] && nums[mid]<nums[prev]){
                return mid;
            }else if(nums[mid]> nums[end]){
                start = mid+1;
            }else{
                end =mid-1;
            }
        }
        return -1;
    }

    private int getIndexByBinarySearch(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }
}
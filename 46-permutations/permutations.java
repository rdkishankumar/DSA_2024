class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        List<Integer> track = new ArrayList<>();
        permuteHepler(nums, 0, track, result);
        return result; 
    }

    private void permuteHepler(int[] nums, int index, List<Integer> track, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(track));
            return;
        } 
        for(int i = index;i<nums.length;i++){
            swap(nums, i, index);
            track.add(nums[index]);
            permuteHepler(nums, index+1, track, result);
            track.remove(track.size()-1);
            swap(nums, i, index);
        }
    }
    public void swap(int[] nums, int start, int end){
        int copiedEle = nums[start];
        nums[start] = nums[end];
        nums[end] = copiedEle;
    }
}
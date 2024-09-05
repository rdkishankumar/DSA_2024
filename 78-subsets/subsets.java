class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int index = 0;
        subsetsHelper(nums, result, subset, index);
        return result;
        
    }
    private void subsetsHelper(int[] nums, List<List<Integer>> result, List<Integer> subset, int index){
        result.add(new ArrayList<>(subset));
        for(int i = index;i<nums.length;i++){
            subset.add(nums[i]);
            subsetsHelper(nums, result, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }
}
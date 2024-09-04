class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> trackOfSum = new ArrayList<>();
        int index = 0;
        combinationSum(candidates, target, index, trackOfSum, result);
        return result;
        
    }
    public void combinationSum(int[] candidates, int target, int index, List<Integer> trackOfSum, List<List<Integer>> result) {
        if(target == 0){
            result.add(new ArrayList<>(trackOfSum));
        }
        if(target<0) return;

        for(int i = index;i<candidates.length;i++){
            trackOfSum.add(candidates[i]);
            combinationSum(candidates, target-candidates[i], i, trackOfSum, result);
            trackOfSum.remove(trackOfSum.size()-1);
        } 
    }
}
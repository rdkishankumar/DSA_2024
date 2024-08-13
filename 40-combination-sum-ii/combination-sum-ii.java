class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> track = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates, track, result, target, 0);
        return result;
    }

    public void combinationSum2(int[] candidates, List<Integer> track, List<List<Integer>> result, int target,
            int index) {

        if (target == 0) {
            result.add(new ArrayList<>(track));
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) continue;
            track.add(candidates[i]);
            combinationSum2(candidates, track, result, target - candidates[i], i + 1);
            track.remove(track.size() - 1);
        }

    }
}
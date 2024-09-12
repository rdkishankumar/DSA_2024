class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
        return Arrays.stream(words)
                     .mapToInt(w -> w.chars().allMatch(c -> allowed.contains((char)c + "")) ? 1 : 0)
                     .sum();
    }
}
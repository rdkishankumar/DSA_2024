class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;
        Map<Character, Integer> track = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            int idx = track.getOrDefault(currentChar, -1);

            if (idx != -1 && idx >= start) {
                result = Math.max(result, end - start);
                start = idx + 1;
            }
            track.put(currentChar, end);
        }
        return Math.max(result, s.length() - start);
    }
}
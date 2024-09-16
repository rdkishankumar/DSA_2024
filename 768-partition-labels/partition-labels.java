class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26]; // To store last index of each character

        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < S.length(); i++) {
            lastIndex[S.charAt(i) - 'a'] = i;
        }

        // Step 2: Use two pointers to partition the string
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, lastIndex[S.charAt(i) - 'a']); // Extend the end to the farthest last occurrence
            if (i == end) { // When current index reaches the end, partition is complete
                result.add(end - start + 1); // Add size of partition
                start = i + 1; // Update start for the next partition
            }
        }

        return result;
    }
}
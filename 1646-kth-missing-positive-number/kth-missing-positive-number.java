class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 1;
        int index = 0;
        
        while (k > 0) {
            // If current start is not in the array, it is a missing number
            if (index >= arr.length || start < arr[index]) {
                k--;
                // If we have found the kth missing number, return it
                if (k == 0) {
                    return start;
                }
                start++;
            } else {
                // If current start is in the array, move to the next element
                start++;
                index++;
            }
        }
        return -1; // In case no kth positive missing number is found (edge case)
    }
}

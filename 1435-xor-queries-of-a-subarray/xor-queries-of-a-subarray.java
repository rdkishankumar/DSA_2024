class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        int[] res = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];
            if (i == 0) {
                res[k] = prefix[j];
            } else {
                res[k] = prefix[j] ^ prefix[i - 1];
            }
        }
        return res;
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int cookieIndex = 0;
        int childIndex = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        while(cookieIndex<s.length && childIndex<g.length){
            if(s[cookieIndex]>=g[childIndex]){
                count++;
                childIndex++;
            }
            cookieIndex++;
        }
        return count;  
    }
}
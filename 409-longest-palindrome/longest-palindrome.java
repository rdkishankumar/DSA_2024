class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean isOddExist = false;

        for(int count: freq.values()){
            length+= (count/2)*2;
            if(count%2==1){
                isOddExist =true;
            }
        }
        if(isOddExist) return length+1;

        return length;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        //count frequency of each Character
        for(char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean isOddExist = false;

        for(int count: freq.values()){
            //take even count- let's if count = 3 then 3/2 = 1 and 1*2 = 2
            length+= (count/2)*2;
            if(count%2==1){
                isOddExist =true;
            }
        }
        if(isOddExist) return length+1;

        return length;
    }
}
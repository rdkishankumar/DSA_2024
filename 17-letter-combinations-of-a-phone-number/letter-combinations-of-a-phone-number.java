class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0) return result;
        Map<Character, String> letters = new HashMap<>();
        letters.put('2',"abc");
        letters.put('3',"def");
        letters.put('4',"ghi");
        letters.put('5',"jkl");
        letters.put('6',"mno");
        letters.put('7',"pqrs");
        letters.put('8',"tuv");
        letters.put('9',"wxyz"); 


        int index = 0;
        StringBuilder compute = new StringBuilder();
        letterCombinationsHelper(digits, result, 0, letters, compute);
        return result;
    }

    private void letterCombinationsHelper(String digits, List<String> result, int idx, Map<Character, String> letters, StringBuilder compute){
        if(compute.length() == digits.length()){
            result.add(compute.toString());
            return;
        }
        Character ch = digits.charAt(idx);
        String str = letters.get(ch);
        for(int i = 0;i<str.length();i++){
            compute.append(str.charAt(i));
            letterCombinationsHelper(digits, result, idx+1, letters, compute);
            compute.deleteCharAt(compute.length()-1);
        }
    }
}
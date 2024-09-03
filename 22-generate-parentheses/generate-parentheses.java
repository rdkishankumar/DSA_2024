class Solution {
    public List<String> generateParenthesis(int n) {
        int openP = 0;
        int closeP = 0;
        StringBuilder trackOfP = new StringBuilder();
        List<String> result = new ArrayList<>();
        generateParenthesis(n, result, openP, closeP, trackOfP);
        return result;
    }
    private void  generateParenthesis(int n, List<String> result, int openP, int closeP,  StringBuilder trackOfP){
        if(trackOfP.length() == 2*n){
            result.add(trackOfP.toString());
            return;
        }
        if(openP<n){
            trackOfP.append('(');
            generateParenthesis(n, result, openP+1, closeP, trackOfP);
            trackOfP.deleteCharAt(trackOfP.length()-1);
        }

        if(closeP<openP){
            trackOfP.append(')');
            generateParenthesis(n, result, openP, closeP+1, trackOfP);
            trackOfP.deleteCharAt(trackOfP.length()-1);
        }
    }
}
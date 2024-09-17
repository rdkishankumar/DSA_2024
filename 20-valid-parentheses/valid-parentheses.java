class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        int n = s.length();
        int index = 0;
        char[] ch = s.toCharArray();
        while(index<n){
            if(ch[index]=='(' || ch[index]=='{' || ch[index]=='['){
                stack.push(ch[index]);
            }else if (ch[index] == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch[index] == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch[index] == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else{
                return false;
            }
            index++;
        }
        return stack.isEmpty();
    }
}
class Solution {
    public int maximum69Number (int num) {
        // Convert the number to a string
        String numStr = Integer.toString(num);
        
        // Convert the string to a character array for manipulation
        char[] numArr = numStr.toCharArray();
        
        // Find the first occurrence of '6' and change it to '9'
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == '6') {
                numArr[i] = '9';
                break; // Change only the first '6'
            }
        }
        
        // Convert the array back to a string, then to an integer
        return Integer.parseInt(new String(numArr));
    }
}

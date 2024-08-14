class Solution {
   public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);
            maxArea = Math.max(maxArea, area);
            
            // Move the pointer that is at the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
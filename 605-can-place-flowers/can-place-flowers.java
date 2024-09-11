class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and the previous and next plots are valid and empty
            if (flowerbed[i] == 0 &&
               (i == 0 || flowerbed[i - 1] == 0) && // If i == 0, no previous plot exists
               (i == length - 1 || flowerbed[i + 1] == 0)) { // If i == length-1, no next plot exists
                
                // Plant the flower
                flowerbed[i] = 1;
                n--; // Reduce the number of flowers left to plant
                
                // If all flowers are planted, return true
                if (n == 0) {
                    return true;
                }
            }
        }
        // If there are still flowers left to plant, return false
        return n <= 0;
    }
}

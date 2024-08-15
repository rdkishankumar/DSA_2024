class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> trackOfEx = new HashMap<>();
        trackOfEx.put(5, 0);
        trackOfEx.put(10, 0);
        trackOfEx.put(20, 0);
        
        for (int bill : bills) {
            if (bill == 5) {
                trackOfEx.put(5, trackOfEx.get(5) + 1);
            } else if (bill == 10) {
                if (trackOfEx.get(5) > 0) {
                    trackOfEx.put(5, trackOfEx.get(5) - 1);
                    trackOfEx.put(10, trackOfEx.get(10) + 1);
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (trackOfEx.get(10) > 0 && trackOfEx.get(5) > 0) {
                    trackOfEx.put(10, trackOfEx.get(10) - 1);
                    trackOfEx.put(5, trackOfEx.get(5) - 1);
                } else if (trackOfEx.get(5) >= 3) {
                    trackOfEx.put(5, trackOfEx.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}
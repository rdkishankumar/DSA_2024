class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxUnits = 0;

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for (int[] box : boxTypes) {
            int numberOfBoxes = box[0];
            int numberOfUnitsPerBox = box[1];
            if (truckSize >= numberOfBoxes) {
                maxUnits += numberOfBoxes * numberOfUnitsPerBox;
                truckSize -= numberOfBoxes;
            } else {
                maxUnits += truckSize * numberOfUnitsPerBox;
                break;
            }
        }
        return maxUnits;

    }
}
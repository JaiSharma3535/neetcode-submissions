public class Solution {
    private int Times(int piles[], int s) {
        int hour = 0;
        for (int i = 0; i < piles.length; i++) {
            hour += Math.ceil((double) piles[i] / s);
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
           max=Math.max(piles[i],max);
        }
        int l = 1;
        int high = max;
        int result = max;
        while (l <= high) {
            int mid = (l + high) / 2;
            int hours = Times(piles, mid);
            if (hours <= h) {
                result = mid;
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }
}
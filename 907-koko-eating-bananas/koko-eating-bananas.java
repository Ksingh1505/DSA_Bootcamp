class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // find max pile
        for (int p : piles) {
            high = Math.max(high, p);
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            long hours = 0;
            
            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil(p/mid)
            }
            
            if (hours <= h) {
                ans = mid;       // possible answer
                high = mid - 1;  // try smaller
            } else {
                low = mid + 1;   // increase speed
            }
        }
        
        return ans;
    }
}
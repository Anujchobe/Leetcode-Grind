class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; // Tracks the furthest index that can be reached
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                // If the current index is beyond the furthest reachable point, return false
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]); // Update max reachable index
            if (maxReach >= nums.length - 1) {
                // If we can reach or go beyond the last index, return true
                return true;
            }
        }
        return false; // If the loop completes, return false
    }
}

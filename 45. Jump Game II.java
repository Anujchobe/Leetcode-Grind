class Solution {
    public int jump(int[] nums) {
                int n = nums.length;
        int jumps = 0;       // Number of jumps
        int currentEnd = 0;  // End of the range for the current jump
        int farthest = 0;    // Farthest index reachable so far

        // Iterate through the array (except the last element)
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest index reachable from index `i`
            farthest = Math.max(farthest, i + nums[i]);

            // If we reach the end of the current jump range
            if (i == currentEnd) {
                jumps++;          // Increment the jump count
                currentEnd = farthest; // Update the range for the next jump
            }
        }

        return jumps;
    }
}

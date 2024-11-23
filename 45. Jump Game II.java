class Solution {
    public int jump(int[] nums) {
                int n = nums.length;
        int jumps = 0;       
        int currentEnd = 0;  
        int farthest = 0;   

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

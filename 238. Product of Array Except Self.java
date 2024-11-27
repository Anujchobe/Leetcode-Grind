class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Handle edge cases
        if (nums == null || nums.length == 0) {
            return new int[0]; // Return an empty array if input is null or empty
        }

        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Compute prefix products
        answer[0] = 1; // The prefix product for the first element is 1 (nothing to its left)
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Step 2: Compute suffix products and final result
        int suffixProduct = 1; // Start with a suffix product of 1
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffixProduct; // Multiply prefix and suffix
            suffixProduct *= nums[i]; // Update suffix product
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

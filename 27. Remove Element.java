class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer for the position of elements that are not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Copy the non-val element to the k-th position
                k++;  // Increment k to expand the range of valid elements
            }
        }
        
        return k;  // k is the count of elements that are not equal to val
    }
}

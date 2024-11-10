class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int temp=1;
        for (int i=1;i<nums.length;i++)
        {            
            if(nums[i]==nums[i-1])
            {
                temp++;
            }
            else
            temp=1;
            if(temp<=2)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

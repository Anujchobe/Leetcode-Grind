  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lst=m+n-1;
        int a1=m-1;
        int a2=n-1;

        while(a1>=0 && a2>=0)
        {
            if (nums1[a1]>nums2[a2])
            {
                nums1[lst]=nums1[a1];
                a1--;                
            }
            else
            {
                nums1[lst]=nums2[a2];
                a2--;
            }
            lst--;
        }

        while(a2>=0)
        {
            nums1[lst]=nums2[a2];
            a2--;
            lst--;
        }
    }
}

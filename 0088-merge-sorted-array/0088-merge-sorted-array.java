class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
//two pointer approach
//1 2 3 0 0 0       2 5 6

//p1=m-1 p2=n-1
//6>3 so it will go at the end of the array 1 2 3 0 0 6
//nums2[p2]>num1[p1]
//nums1[i]=num2[p2]

//indexes are decremented
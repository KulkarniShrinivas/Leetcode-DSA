class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int[] a = new int[n];
        for(int i=0; i<nums.length; i++){
            a[(i+k)%n] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = a[i];
        }
    }
}


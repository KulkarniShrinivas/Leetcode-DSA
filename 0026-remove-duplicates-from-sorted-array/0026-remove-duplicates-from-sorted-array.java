class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1; // Initialize the pointer for the unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // Update the array in place with unique elements
                j++; // Move the unique element pointer to the next position
            }
        }
        return j; // Return the count of unique elements
    }
}

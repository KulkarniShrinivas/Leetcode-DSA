class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sumOfArray = 0;
        for(int i=0; i<n; i++){
            sumOfArray = sumOfArray + nums[i];
        }
        int missingNumber = sum - sumOfArray;
        return missingNumber;
    }
}


// Initialize n with the length of the array nums, which is 3 in this case.
// Initialize sum to 0.
// Calculate the sum of the first n natural numbers using the formula n * (n + 1) / 2. In this case, it would be 3 * (3 + 1) / 2 = 6.
// Start the while loop: while (n > 0).
// Iteration 1: sum += 3, n-- (sum = 3, n = 2)
// Iteration 2: sum += 2, n-- (sum = 5, n = 1)
// Iteration 3: sum += 1, n-- (sum = 6, n = 0)
// Exit the loop.
// Calculate the sum of the elements in the array nums: arrSum = 3 + 0 + 1 = 4.
// Calculate the missing number: result = sum - arrSum = 6 - 4 = 2.
// Print the result: Missing number: 2.




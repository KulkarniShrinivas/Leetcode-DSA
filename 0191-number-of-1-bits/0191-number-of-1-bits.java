public class Solution {
    // Function to count the number of set bits in a positive integer n
    public int hammingWeight(int n) {
        int ans = 0; // Initialize count of set bits
        int mask = 1; // Initialize mask to check each bit of n

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) { // If the bit is set, increment ans
                ans++;
            }
            mask <<= 1; // Move the mask to the next bit
        }
        return ans; // Return the count of set bits
    }
}
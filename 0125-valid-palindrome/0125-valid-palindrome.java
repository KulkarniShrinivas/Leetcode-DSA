class Solution {
    public boolean isPalindrome(String s) {
        // Preprocess the input string
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Get the left and right pointers
        int left = 0;
        int right = s.length() - 1;

        // Start a loop and compare characters
        while (left < right) {
            // If same, move both pointers
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            // If not, simply return false
            else {
                return false;
            }
        }

        // If we come out of the loop, then all
        // characters have matched, return true
        return true;
    }
}

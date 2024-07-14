public class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            // If num is even, divide it by 2, else subtract 1
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
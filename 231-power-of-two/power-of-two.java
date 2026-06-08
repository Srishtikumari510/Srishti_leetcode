class Solution {
    public boolean isPowerOfTwo(int n) {
        // The expression evaluates to true or false automatically
        return n > 0 && (n & (n - 1)) == 0;
    }
}

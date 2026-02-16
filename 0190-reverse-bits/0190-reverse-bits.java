public class Solution {
    /**
     * You need to treat n as an unsigned value
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift result to the left by one bit
            result |= (n & 1); // Add the rightmost bit of n to result
            n >>>= 1; // Unsigned right shift n by one bit
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example usage
        int n1 = 43261596;
        int reversed1 = sol.reverseBits(n1);
        System.out.println("Original: " + n1 + ", Reversed: " + reversed1);

        int n2 = -3;
        int reversed2 = sol.reverseBits(n2);
        System.out.println("Original: " + n2 + ", Reversed: " + reversed2);
    }
}
class Solution {
    public int firstUniqChar(String s) {
        
        // Array to store frequency of 26 letters
        int[] freq = new int[26];
        
        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            
            // If frequency is 1
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // No unique character
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
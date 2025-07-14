class Solution {
    // Function to arrange all letters of a string in lexicographical
    // order using Counting Sort.
    public static String countSort(String arr) {
        int[] count = new int[26]; // For 'a' to 'z'

        // Count the frequency of each character
        for (int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            count[ch - 'a']++;
        }

        // Build the sorted string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
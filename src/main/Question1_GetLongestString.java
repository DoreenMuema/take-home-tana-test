package main;

import java.util.*;

public class Question1_GetLongestString {
    /**
     * Returns the longest string that meets the following conditions:
     * 1. No consecutive identical characters
     * 2. Only contains characters from the valid characters list
     *
     * @param characters List of valid characters
     * @param strings Array of strings to check
     * @return The longest valid string or null if none found
     */
    public static String getLongestString(List<Character> characters, String[] strings) {
        // Convert valid characters to a HashSet for O(1) lookups
        Set<Character> validChars = new HashSet<>(characters);
        String longestValid = null;

        for (String str : strings) {
            // Skip if current string is shorter than the longest valid found so far
            if (longestValid != null && str.length() <= longestValid.length()) {
                continue;
            }

            boolean isValid = true;
            char prevChar = '\0'; // Initialize with null character to track previous character

            // Check each character in the string
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // Check for consecutive identical characters
                if (currentChar == prevChar) {
                    isValid = false;
                    break;
                }

                // Check if character is in the valid set
                if (!validChars.contains(currentChar)) {
                    isValid = false;
                    break;
                }

                prevChar = currentChar;
            }

            // Update longestValid if current string is valid and longer
            if (isValid) {
                longestValid = str;
            }
        }

        return longestValid;
    }
}
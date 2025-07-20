package main;

import java.util.*;

public class Question2_UniqueSums {
    /**
     * Counts the number of unique combinations of numbers that sum to the target.
     * Uses backtracking to explore all possible combinations.
     *
     * @param result The target sum to reach
     * @param numbers Array of numbers to use in combinations
     * @return Number of unique combinations that sum to result
     */
    public static int uniqueSums(int result, int[] numbers) {
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        Arrays.sort(numbers); // Sort to avoid duplicate combinations
        backtrack(result, numbers, 0, new ArrayList<>(), uniqueCombinations);
        return uniqueCombinations.size();
    }

    /**
     * Recursive helper function for backtracking.
     * @param remaining Remaining sum to reach
     * @param numbers Sorted array of numbers
     * @param start Index to start from (avoids duplicates)
     * @param current Current combination being built
     * @param uniqueCombinations Set to store unique combinations
     */
    private static void backtrack(int remaining, int[] numbers, int start,
                                  List<Integer> current, Set<List<Integer>> uniqueCombinations) {
        // Base case: If remaining sum is 0, add the current combination
        if (remaining == 0) {
            uniqueCombinations.add(new ArrayList<>(current));
            return;
        }

        // Try each number from 'start' to avoid duplicates
        for (int i = start; i < numbers.length; i++) {
            // Skip if the number is too large
            if (numbers[i] > remaining) break;

            current.add(numbers[i]); // Include the number
            backtrack(remaining - numbers[i], numbers, i + 1, current, uniqueCombinations);
            current.remove(current.size() - 1); // Backtrack (exclude the number)
        }
    }
}
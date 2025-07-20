package main;

import java.util.*;

public class Question2_UniqueSums {
    public static int uniqueSums(int result, int[] numbers) {
        Arrays.sort(numbers);
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        backtrack(result, numbers, 0, new ArrayList<>(), uniqueCombinations);
        return uniqueCombinations.size();
    }

    private static void backtrack(int remaining, int[] numbers, int start,
                                  List<Integer> current, Set<List<Integer>> uniqueCombinations) {
        if (remaining == 0) {
            uniqueCombinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            // Skip duplicates after the first occurrence
            if (i > start && numbers[i] == numbers[i-1]) {
                continue;
            }

            if (numbers[i] > remaining) {
                break;
            }

            current.add(numbers[i]);
            backtrack(remaining - numbers[i], numbers, i + 1, current, uniqueCombinations);
            current.remove(current.size() - 1);
        }
    }
}
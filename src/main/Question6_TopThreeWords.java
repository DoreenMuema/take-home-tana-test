package main;

import java.util.*;
import java.util.stream.*;

public class Question6_TopThreeWords {
    /**
     * Returns the three most common words in a sentence, sorted alphabetically.
     *
     * @param sentence Input sentence
     * @return List of top three words in alphabetical order
     */
    public static List<String> topThreeWords(String sentence) {
        // Split into words, convert to lowercase, and filter out empty strings
        String[] words = sentence.toLowerCase().split("[^a-zA-Z']+");

        // Count word frequencies
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        // Sort by frequency (descending), then alphabetically (ascending)
        return frequency.entrySet().stream()
                .sorted((a, b) -> {
                    int freqCompare = b.getValue().compareTo(a.getValue());
                    if (freqCompare != 0) return freqCompare;
                    return a.getKey().compareTo(b.getKey());
                })
                .limit(3) // Take top 3
                .map(Map.Entry::getKey) // Extract words
                .sorted() // Sort alphabetically
                .collect(Collectors.toList());
    }
}
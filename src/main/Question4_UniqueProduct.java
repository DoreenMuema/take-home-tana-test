package main;

import java.util.*;

public class Question4_UniqueProduct {
    /**
     * Finds the first product in an array that occurs only once.
     * Uses LinkedHashMap to maintain insertion order.
     *
     * @param products Array of product names
     * @return First unique product or null if none exists
     */
    public static String firstUniqueProduct(String[] products) {
        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        // Count occurrences of each product
        for (String product : products) {
            countMap.put(product, countMap.getOrDefault(product, 0) + 1);
        }

        // Find the first product with count = 1
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No unique product found
    }
}
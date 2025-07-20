package main;

public class Question5_MinDistance {
    /**
     * Finds the smallest distance between two occurrences of the minimum value.
     *
     * @param a The input array
     * @return The smallest distance between two minimums
     */
    public static int findMinDistance(int[] a) {
        // Find the minimum value
        int minValue = Integer.MAX_VALUE;
        for (int num : a) {
            if (num < minValue) {
                minValue = num;
            }
        }

        int minDistance = Integer.MAX_VALUE;
        int prevIndex = -1; // Track the previous occurrence of the minimum

        for (int i = 0; i < a.length; i++) {
            if (a[i] == minValue) {
                if (prevIndex != -1) {
                    // Update minDistance if current distance is smaller
                    minDistance = Math.min(minDistance, i - prevIndex);
                }
                prevIndex = i; // Update previous index
            }
        }

        return minDistance;
    }
}
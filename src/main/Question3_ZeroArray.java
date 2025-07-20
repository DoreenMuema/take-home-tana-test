package main;

public class Question3_ZeroArray {
    /**
     * Checks if an array can be reduced to all zeros (except first element).
     *
     * @param a The input array
     * @return 1 if possible, 0 otherwise
     */
    public static int canReduceToZero(int[] a) {
        if (a == null || a.length <= 1) {
            return 1; // Empty or single-element array is already "reduced"
        }

        // Track the current base value for reduction
        int current = a[0];

        for (int i = 1; i < a.length; i++) {
            // If current is zero, all remaining must be zero
            if (current == 0) {
                if (a[i] != 0) return 0;
            }
            // Otherwise, check if current divides a[i]
            else if (a[i] % current != 0) {
                return 0;
            }
            // Update current to the subtracted value (a[i] - a[i-1] would be 0)
            current = a[i] - current;
        }

        return 1;
    }
}
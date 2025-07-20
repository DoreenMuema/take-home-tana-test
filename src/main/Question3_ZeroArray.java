package main;

public class Question3_ZeroArray {
    /**
     * Checks if an array can be reduced to all zeros (except first element).
     * The key observation is that each a[i] must be a multiple of a[i-1].
     *
     * @param a The input array
     * @return 1 if possible, 0 otherwise
     */
    public static int canReduceToZero(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] % a[i-1] != 0) {
                return 0; // Not possible
            }
        }
        return 1; // Possible
    }
}
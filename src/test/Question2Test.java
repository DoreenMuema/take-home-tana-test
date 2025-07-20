package test;

import main.Question2_UniqueSums;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question2Test {
    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(3, Question2_UniqueSums.uniqueSums(10, nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 2, 4, 7, 5};
        assertEquals(1, Question2_UniqueSums.uniqueSums(17, nums));
    }

    @Test
    public void testNoCombinations() {
        int[] nums = {2, 4, 6, 8};
        assertEquals(0, Question2_UniqueSums.uniqueSums(7, nums));
    }

    @Test
    public void testAllDuplicates() {
        int[] nums = {2, 2, 2, 2};
        assertEquals(1, Question2_UniqueSums.uniqueSums(4, nums));
    }
}
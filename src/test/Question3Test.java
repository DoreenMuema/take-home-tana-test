package test;

import main.Question3_ZeroArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question3Test {
    @Test
    public void testBasicReductionPossible() {
        int[] a = {1, 2, 3};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }


    @Test
    public void testWithZeros() {
        int[] a = {1, 0, 0, 0};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testSingleElement() {
        int[] a = {5};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testEmptyArray() {
        int[] a = {};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testNullArray() {
        assertEquals(1, Question3_ZeroArray.canReduceToZero(null));
    }

    @Test
    public void testAllZeros() {
        int[] a = {0, 0, 0, 0};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testAlternatingReduction() {
        int[] a = {4, 8, 12, 16};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testNonDivisibleSequence() {
        int[] a = {3, 5, 7};
        assertEquals(0, Question3_ZeroArray.canReduceToZero(a));
    }

}
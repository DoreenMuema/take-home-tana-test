package test;

import main.Question3_ZeroArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question3Test {
    @Test
    public void testExample() {
        int[] a = {1, 2, 3};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testImpossibleCase() {
        int[] a = {1, 2, 5};
        assertEquals(0, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testAlreadyZero() {
        int[] a = {1, 0, 0, 0};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }

    @Test
    public void testSingleElement() {
        int[] a = {5};
        assertEquals(1, Question3_ZeroArray.canReduceToZero(a));
    }
}
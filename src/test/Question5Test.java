package test;

import main.Question5_MinDistance;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question5Test {
    @Test
    public void testExample() {
        int[] a = {1, 2, 3, 1, 4, 5, 2};
        assertEquals(3, Question5_MinDistance.findMinDistance(a));
    }

    @Test
    public void testAdjacentMins() {
        int[] a = {5, 2, 2, 7, 8};
        assertEquals(1, Question5_MinDistance.findMinDistance(a));
    }

    @Test
    public void testMultipleMins() {
        int[] a = {1, 3, 1, 5, 1, 7, 1};
        assertEquals(2, Question5_MinDistance.findMinDistance(a));
    }

    @Test
    public void testAllSame() {
        int[] a = {2, 2, 2, 2};
        assertEquals(1, Question5_MinDistance.findMinDistance(a));
    }
}
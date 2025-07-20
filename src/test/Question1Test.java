package test;

import main.Question1_GetLongestString;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class Question1Test {
    @Test
    void testGetLongestString() {
        List<Character> chars = Arrays.asList('A', 'B', 'C', 'D');
        String[] strings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        assertEquals("ABCDABDCA", Question1_GetLongestString.getLongestString(chars, strings));
    }
}
package test;

import main.Question6_TopThreeWords;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Question6Test {
    @Test
    public void testExample() {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> expected = Arrays.asList("algorithm", "or", "to");
        assertEquals(expected, Question6_TopThreeWords.topThreeWords(input));
    }

    @Test
    public void testFewerThanThreeWords() {
        String input = "hello hello world";
        List<String> expected = Arrays.asList("hello", "world");
        assertEquals(expected, Question6_TopThreeWords.topThreeWords(input));
    }

    @Test
    public void testTieBreaker() {
        String input = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, Question6_TopThreeWords.topThreeWords(input));
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        List<String> expected = List.of();
        assertEquals(expected, Question6_TopThreeWords.topThreeWords(input));
    }
}
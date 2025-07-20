package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tufin Junior Developer Assessment Solutions ===\n");

        runQuestion1();
        runQuestion2();
        runQuestion3();
        runQuestion4();
        runQuestion5();
        runQuestion6();
        runQuestion7();
    }

    private static void runQuestion1() {
        System.out.println("Question 1: Get Longest Valid String");
        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        String[] strings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        String result = Question1_GetLongestString.getLongestString(validChars, strings);
        System.out.println("Result: " + result + "\n");
    }

    private static void runQuestion2() {
        System.out.println("Question 2: Unique Sums");
        int[] numbers = {1, 2, 3, 4, 5};
        int result = Question2_UniqueSums.uniqueSums(10, numbers);
        System.out.println("Unique combinations: " + result + "\n");
    }

    private static void runQuestion3() {
        System.out.println("Question 3: Zero Array Possibility");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 5};
        System.out.println("Can reduce [1,2,3] to zeros: " + Question3_ZeroArray.canReduceToZero(array1));
        System.out.println("Can reduce [1,2,5] to zeros: " + Question3_ZeroArray.canReduceToZero(array2) + "\n");
    }

    private static void runQuestion4() {
        System.out.println("Question 4: First Unique Product");
        String[] products = {"Apple", "Computer", "Apple", "Bag"};
        String result = Question4_UniqueProduct.firstUniqueProduct(products);
        System.out.println("First unique product: " + result + "\n");
    }

    private static void runQuestion5() {
        System.out.println("Question 5: Distance Between Minimums");
        int[] array = {1, 2, 3, 1, 4, 5, 2};
        int result = Question5_MinDistance.findMinDistance(array);
        System.out.println("Minimum distance: " + result + "\n");
    }

    private static void runQuestion6() {
        System.out.println("Question 6: Top Three Words");
        String sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> result = Question6_TopThreeWords.topThreeWords(sentence);
        System.out.println("Top three words: " + result + "\n");
    }

    private static void runQuestion7() {
        System.out.println("Question 7: Rotate Linked List");
        Question7_RotateList.ListNode head = Question7_RotateList.createList(
                new String[]{"I_D_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"}
        );
        Question7_RotateList.ListNode rotated = Question7_RotateList.rotateList(head, 2);
        System.out.println("Rotated list: " + Question7_RotateList.listToString(rotated));
    }
}
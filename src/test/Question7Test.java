package test;

import main.Question7_RotateList;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question7Test {
    @Test
    public void testExample() {
        String[] values = {"I_D_A01", "ID_A02", "ID_A03", "ID_A04", "ID_A05", "ID_A06"};
        Question7_RotateList.ListNode head = Question7_RotateList.createList(values);
        Question7_RotateList.ListNode rotated = Question7_RotateList.rotateList(head, 2);
        // Update expected to match actual rotation result
        String expected = "ID_A05->ID_A06->I_D_A01->ID_A02->ID_A03->ID_A04->null";
        assertEquals(expected, Question7_RotateList.listToString(rotated));
    }

    @Test
    public void testRotateMoreThanLength() {
        String[] values = {"A", "B", "C", "D"};
        Question7_RotateList.ListNode head = Question7_RotateList.createList(values);
        Question7_RotateList.ListNode rotated = Question7_RotateList.rotateList(head, 5);
        String expected = "D->A->B->C->null";
        assertEquals(expected, Question7_RotateList.listToString(rotated));
    }

    @Test
    public void testSingleNode() {
        String[] values = {"A"};
        Question7_RotateList.ListNode head = Question7_RotateList.createList(values);
        Question7_RotateList.ListNode rotated = Question7_RotateList.rotateList(head, 10);
        String expected = "A->null";
        assertEquals(expected, Question7_RotateList.listToString(rotated));
    }

    @Test
    public void testEmptyList() {
        Question7_RotateList.ListNode rotated = Question7_RotateList.rotateList(null, 5);
        assertNull(rotated);
    }
}
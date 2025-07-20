package test;

import main.Question4_UniqueProduct;
import org.junit.Test;
import static org.junit.Assert.*;

public class Question4Test {
    @Test
    public void testExample() {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};
        assertEquals("Computer", Question4_UniqueProduct.firstUniqueProduct(products));
    }

    @Test
    public void testNoUnique() {
        String[] products = {"A", "A", "B", "B"};
        assertNull(Question4_UniqueProduct.firstUniqueProduct(products));
    }

    @Test
    public void testAllUnique() {
        String[] products = {"A", "B", "C"};
        assertEquals("A", Question4_UniqueProduct.firstUniqueProduct(products));
    }

    @Test
    public void testEmptyArray() {
        String[] products = {};
        assertNull(Question4_UniqueProduct.firstUniqueProduct(products));
    }
}
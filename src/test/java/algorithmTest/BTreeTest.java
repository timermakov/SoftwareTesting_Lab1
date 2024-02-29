package algorithmTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import algorithm.BTree;

public class BTreeTest {

    @Test
    void testInsert() {
        BTree<Integer, String> bTree = new BTree<>();
        bTree.put(1, "value1");
        bTree.put(2, "value2");
        bTree.put(3, "value3");

        assertEquals("value1", bTree.get(1));
        assertEquals("value2", bTree.get(2));
        assertEquals("value3", bTree.get(3));
    }

    @Test
    void testSize() {
        BTree<Integer, String> bTree = new BTree<>();
        assertEquals(0, bTree.size());
        bTree.put(1, "value1");
        bTree.put(2, "value2");
        bTree.put(3, "value3");
        assertEquals(3, bTree.size());
        bTree.put(4, "value4");
        assertEquals(4, bTree.size());
    }

    @Test
    void testHeight() {
        BTree<Integer, String> bTree = new BTree<>();
        assertEquals(0, bTree.height());
        bTree.put(1, "value1");
        assertEquals(0, bTree.height());
        bTree.put(2, "value2");
        assertEquals(0, bTree.height());
        bTree.put(3, "value3");
        assertEquals(0, bTree.height());
        bTree.put(4, "value4");
        assertEquals(1, bTree.height());
    }

    @Test
    void testInsertException() {
        BTree<Integer, String> bTree = new BTree<>();
        assertThrows(IllegalArgumentException.class, ()->bTree.put(null, "value3"));
    }
}

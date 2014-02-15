import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public class AvlTreeTest {
    @Test
    public void testTheBasics() throws Exception {
        AvlTree<Integer> tree = new AvlTree<>();

        tree.insert(5);
        tree.insert(3);
        tree.insert(6);

        assertTrue(tree.contains(5));
        tree.insert(7);

        assertTrue(tree.contains(7));

        tree.remove(7);

        assertFalse(tree.contains(7));
    }

    @Test
    public void testToSortedList() throws Exception {
        AvlTree<Integer> tree = new AvlTree<>();

        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(7);

        List<Integer> list = tree.toSortedList();

        assertArrayEquals(list.toArray(), new Integer[]{3, 5, 6, 7});
   }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AvlNodeTest {
    @Test
    public void testToGraphvizString() throws Exception {
        AvlNode<Integer> node1 = new AvlNode<Integer>(3);
        AvlNode<Integer> node2 = new AvlNode<Integer>(6);
        AvlNode<Integer> node3 = new AvlNode<Integer>(5, node1, node2);

        assertEquals(node3.toGraphvizString(), "5 -> 3\n5 -> 6\n");

    }
}

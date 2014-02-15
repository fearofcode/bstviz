public class AvlNode<T> {
    // Constructors
    public AvlNode(T theElement) {
        this(theElement, null, null);
    }

    public AvlNode(T theElement, AvlNode<T> lt, AvlNode<T> rt) {
        element = theElement;
        left = lt;
        right = rt;
        height = 0;
    }

    public String toGraphvizString() {
        if(element != null) {
            StringBuffer sb = new StringBuffer();
            String a = element.toString();

            if(left != null) {
                String b0 = left.element.toString();
                sb.append(a + " -> " + b0 + "\n");
            }

            if(right != null) {
                String b1 = right.element.toString();
                sb.append(a + " -> " + b1 + "\n");
            }

            return sb.toString();
        }

        return "";
    }

    T element;      // The data in the node
    AvlNode<T> left;         // Left child
    AvlNode<T> right;        // Right child
    int height;       // Height
}
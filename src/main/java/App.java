import java.util.Date;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        AvlTree<Integer> tree = new AvlTree<>();

        final int N = 32;
        //final int max = 1000;

        //Random rng = new Random();

        for(int i = 1; i <= N; i++) {
            tree.insert(i);
        }

        String dotFilename = N + "_inserted_in_order.dot";

        tree.writeGraphVizFile(dotFilename, "png");

        System.out.println(new Date() + ": Done!");
    }
}

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> demo = new Vector<>(5,2);
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.add(4);
        demo.add(5);
        System.out.println(demo.capacity());
        demo.add(2);
        System.out.println(demo.capacity());
    }
}

import java.util.Stack;

public class Stackdemo  {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);

        System.out.println(demo);

        demo.pop();
        System.out.println(demo);

        //For showing top element in stack
        Integer peek = demo.peek();
        System.out.println(peek);
    }
}

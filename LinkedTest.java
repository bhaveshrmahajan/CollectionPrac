import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class LinkedTest {
    public static void main(String[] args) {

LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);//O(n)
    list.addLast(4);
    list.addFirst(0);//O(1)
    list.getFirst();
    list.getLast();
    System.out.println(list);
    list.removeIf(x -> x % 2 == 0);
    System.out.println(list);

    LinkedList<String> animals =new LinkedList<>(Arrays.asList("Dog","Cat","Lion","Elephant"));
    LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Cat"));
    animals.removeAll(animalsToRemove);
    System.out.println(animals);

    }

}

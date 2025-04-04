import java.lang.reflect.Field;
import java.util.*;

public class ArrayList {

    static class MyComperator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public static void  main(String[] args) throws Exception {

//        List<Integer> list = new java.util.ArrayList<>();
//
//        //adding a element in list
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        //Print a element 3 index
//        System.out.println(list.get(3));
//
//        //get a size of arraylist
//        System.out.println(list.size());
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//       }
//
//        //use for each for display the list
//        for(int i:list)
//            System.out.println(i);
//
//        //Checked element present in list
//        System.out.println(list.contains(20));
//
//        //For removing element
//        list.remove(2);
//
//        //for changing 3rd index element
//        list.add(3, 80);
//
//        //replace 3rd index element to 90
//        list.set(3, 90);
//
//        System.out.println(list);
//
//        Field field =ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list) ;
//        System.out.println("ArrayList capacity: "+elementData.length);
//
//        list.add(1);
//        elementData =(Object[]) field.get(list) ;
//        System.out.println("ArrayList capacity: "+elementData.length);
//
//        List<String> day = new java.util.ArrayList<>();
//        System.out.println(day.getClass().getName());
//
//        //Arrays.asList Can not be added element only replace element
//        List<String> days = Arrays.asList("Monday", "Tuesday", "Wednesday");
//        System.out.println(days.get(2));
//
//        //Add days collection in days1 list
//        List<String> days1 = new java.util.ArrayList<>(days);
//        days1.add("Thursday");
//        days1.add("Friday");
//        days1.add("Saturday");
//        days1.add("Sunday");
//
//        System.out.println(days1);
//
//        //List.of unmodifiable list
//        List.of(10, 20, 30, 40);
//
//        //valueof method for remove element not index
//        list.remove(Integer.valueOf(20));
//        System.out.println(list);
//
//        Object[] array =list.toArray();
//        Integer[] array1=list.toArray(new Integer[0]);

        List<Integer> list = new java.util.ArrayList<>();

        //adding a element in list
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println(list);

        //For Sorting a element
        Collections.sort(list);
        System.out.println(list);

        //for desc using Compare
        list.sort(new MyComperator());
        System.out.println(list);

        //using lambada exp
        list.sort((a ,b) -> b-a);
        System.out.println(list);

        //  list.sort((a,b)-> a.length -b.length);



    }
}

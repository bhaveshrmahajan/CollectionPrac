import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Bhavesh",22);
        Person p2 = new Person("Mayur",33);
        Person p3 =new Person("Bhavesh",22);

        map.put(p1,"Software Engineer");
        map.put(p2,"Data Analytics");
        map.put(p3,"Full Stack Developer");

        System.out.println("HashMap Size: "+map.size());
        System.out.println("Values for p1: "+map.get(p1));
        System.out.println("Values for p3: "+map.get(p3));
        System.out.println();

    }
}
class Person {

    private int id;
    private String name;

    Person(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
}

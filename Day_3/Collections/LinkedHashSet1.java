import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Hari");
        set.add("Kavay");
        set.add("Mother");
        set.add("Arun");
        set.add("Vinayaka");
        set.add("vinayaka");

        System.out.println(set);

        set.remove("Kavya");

        System.out.println(set);
    }
}

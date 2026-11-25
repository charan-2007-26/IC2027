import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> values = new TreeSet<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
        values.add(50);

        System.out.println("Total values Before Deleting : "+values);

        values.remove(30);

        System.out.println("Total values After Deleting : "+values);

    }
}

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> num = new HashSet<>();
        num.add("Hari");
        num.add("Kavya");
        num.add("Mother");
        num.add("Hari");

        System.out.println(num);

        System.out.println("Contains Hari : "+num.contains("Hari"));

        num.remove("Mother");

        System.out.println("After Removel "+num);
    }
}

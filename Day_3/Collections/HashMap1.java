import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> stu = new HashMap<>();
        stu.put(10,"Hari");
        stu.put(20,"Vishalakshi");
        stu.put(30, "Kavya");

        System.out.println(stu);

        System.out.println("Student 10 :" +stu.get(10));

        stu.put(101, "Vinayaka");

        stu.remove(30);

        System.out.println("Updated Map"+stu);
    }
}

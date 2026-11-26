package Day_4;

import java.util.HashSet;

public class Task_7 {
    public static void main(String[] args) {
        HashSet<Integer> Id=new HashSet<>();
        Id.add(3241);
        Id.add(3242);
        Id.add(3243);
        Id.add(3244);
        Id.add(3245);
        Id.add(3246);
        Id.add(3241);
        Id.add(3241);
        System.out.println(Id);
        Id.remove(6);
        Id.remove(7);
        System.out.println(Id.contains(3241));
        System.out.println(Id);
        System.out.println("registrations "+Id.size());
        

    }
}

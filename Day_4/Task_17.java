package Day_4;

import java.util.TreeMap;

public class Task_17 {
    public static void main(String[] args) {
        TreeMap<Integer,String> Database=new TreeMap<>();
        Database.put(1, "charan");
        Database.put(2, "kiran");
        Database.put(3, "Dhanush");
        System.out.println(Database.get(1));
        Database.put(1, "R Charan");
        System.out.println(Database);
        Database.remove(3);
        System.out.println(Database);
        System.out.println(Database.firstKey());
        System.out.println(Database.lastKey());
        System.out.println(Database);
    }
}

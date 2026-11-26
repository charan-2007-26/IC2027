package Day_4;

import java.util.HashMap;

public class Task_13 {
    public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Charan", 100);
        marks.put("Kiran", 99);
        marks.put("daran", 100);
        marks.put("thrun", 100);
        System.out.println(marks.get("Charan"));
        marks.put("Charan", 99);
        System.out.println(marks);
        marks.remove("kiran");
        System.out.println(marks);
        System.out.println(marks.containsKey("daran"));
        System.out.println(marks.keySet());
        System.out.println(marks.values());


    }
}

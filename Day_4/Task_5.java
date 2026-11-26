package Day_4;

import java.util.LinkedList;

public class Task_5 {
    public static void main(String[] args) {
        LinkedList<String> Url=new LinkedList<>();
        Url.add("https://ssms.saranv.in/student/tasks/sol");
        Url.add("https://ssms.saranv.in/student/tasks/desc");
        Url.add("https://ssms.saranv.in/student/tasks");
        Url.add("https://ssms.saranv.in/student/grade");
        System.out.println(Url);
        Url.removeLast();
        System.out.println(Url.getFirst());
        System.out.println(Url.getLast());
        System.out.println(Url.contains("https://ssms.saranv.in/student/grade"));
        Url.clear();
        System.out.println(Url);

    }
    
}

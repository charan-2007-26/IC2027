package Day_4;

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> Employee=new ArrayList<>();
        Employee.add("charan");
        Employee.add("cherry");
        Employee.add("lokesh");
        Employee.add("loke");
        Employee.remove(0);
        Employee.remove(1);
        System.out.println("Attendance list: "+Employee);
       if (Employee.contains("loke")) {
        System.out.println(" Present");

       }else{
        System.out.println("absent");
       }
       System.out.println("Total present employee "+Employee.size());
       for (int i = Employee.size()-1; i >=0; i--) {
        System.out.println(Employee.get(i));
        
       }

    }
}

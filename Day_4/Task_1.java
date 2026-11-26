package Day_4;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> Student=new ArrayList<>();
        Student.add("Student1");
        Student.add("Student2");
        Student.add("Student3");
        Student.add("Student4");
        Student.add("Student5");
        Student.add("Student6");
        Student.add("Student7");
        Student.add("Student8");
        Student.add("Student9");
        Student.add("Student10");
        Student.add("Student11");
        System.out.println(Student);
        Student.add(5, "Cherry");
        Student.remove("Student6");
        Student.set(5, "Charan");
        System.out.println(Student.contains("Student6"));
        System.out.println(Student);
        System.out.println(Student.size());


    }
    
}

package Day_3;
class StudentProfile{
    String studentName=null;
    void find(){
        try {
            System.out.println(studentName.length());
        } catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }
}

public class Task_22 {
    public static void main(String[] args) {
        StudentProfile an=new StudentProfile();
        an.find();
    }
    
}

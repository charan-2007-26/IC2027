package Day_3;
class StudentDetails{
    String details="Charan,41,java,99";
}

public class Task_16 {
    public static void main(String[] args) {
        StudentDetails sd=new StudentDetails();
        String[] str=sd.details.split(",");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
    
}

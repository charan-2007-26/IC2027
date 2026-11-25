package Day_3;
class StudentName{
    String Name="Saran Velmuguran";
    void len(){
        System.out.println("length: "+Name.length());
    }
    void In(){
        System.out.println(Name.charAt(0));
        System.out.println(Name.charAt(Name.length()-1));
        System.out.println(Name.charAt(5));

    }
}

public class Task_2 {
    public static void main(String[] args) {
        StudentName sn=new StudentName();
        sn.len();
        sn.In();
    }
    
}

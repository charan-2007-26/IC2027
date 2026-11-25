package Day_3;
class StudentNameProcessor{
    String fullName=" rahul Kumar ";
}

public class Task_19 {
    public static void main(String[] args) {
        StudentNameProcessor snp=new StudentNameProcessor();
        System.out.println("Original name :"+snp.fullName);
        System.out.println("Cleaned Name :"+snp.fullName.trim());
        System.out.println("Uppercase Name :"+snp.fullName.trim().toUpperCase());
        System.out.println("character count :"+snp.fullName.trim().toUpperCase().length());
        System.out.println("Uppercase Name :"+snp.fullName.trim().toUpperCase().indexOf(4));
         System.out.println(" :"+snp.fullName.trim().toUpperCase().substring(0, 4));
    }
}

package Day_3;
import java.util.Scanner;
class AppointmentBooking{
    String patientName;
    int age;
    String appoinmentTime;
    String[] availableSlots={"09:30 AM","10:15 AM","11:30 AM"};
}

public class Task_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AppointmentBooking ab=new AppointmentBooking();

        try {
            ab.patientName="charan";
            System.out.println(ab.patientName.length());//Null pointer exception
            ab.age=10;//IllegalArgumentException
            if(ab.age<=0){
                throw new IllegalArgumentException("age must be above 1");
            }else {
                System.out.println(ab.age);}
            System.out.println("Select your slot by index");
            int pos=sc.nextInt();
            System.out.println(ab.availableSlots[pos]);//array index out of bounds exception

            
        } catch (NullPointerException e) {
            System.out.println("Null ppointer Exception");   
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        finally{
            System.out.println("Appointment Booking process completed");
        }
        System.out.println("Appointment Booked Successfully");

        
    }
    
}

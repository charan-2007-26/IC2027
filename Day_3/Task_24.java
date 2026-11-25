package Day_3;

import java.util.Scanner;

class TicketBooking{
    String passengerName="Rahul";
}

public class Task_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TicketBooking tb=new TicketBooking();
        System.out.println("Enter a character position :");
        int pos=sc.nextInt();
        try {
            System.out.println("character :"+tb.passengerName.charAt(pos));

            
        } catch (StringIndexOutOfBoundsException e) {
           System.out.println("Out of Bouund");
        }
        
    }
    
}

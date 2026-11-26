package Day_4;

import java.util.HashMap;
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> Contacts=new HashMap<>();
        //Add new contacts
        Contacts.put("charan",773097545);
        Contacts.put("kiran",886715883);
        Contacts.put("tharun",950206177);
        Contacts.put("Ashok",950216616);
        //update existing phone numbers

        Contacts.replace("charan",987654321);
        //Search for contact
        System.out.println("Enter name to search the contact: ");
        String name=sc.next();
        System.out.println(name+ " Phone Number: "+Contacts.get(name));
        Contacts.remove("kiran");
        //displaying all contacts
        System.out.println(Contacts.values());
        //Check whether a particular phone number is already saved.
        System.out.println("Check the the phone number exist or not");
        int phone=sc.nextInt();
        if (Contacts.containsKey(phone)) {
            System.out.println("Already Exist");
            
        }else{
            System.out.println("Not existed");
        }


    }
    
}

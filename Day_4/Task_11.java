package Day_4;

import java.util.LinkedHashSet;

public class Task_11 {
    public static void main(String[] args) {
        LinkedHashSet<String> contactNames=new LinkedHashSet<>();
        contactNames.add("Rekha");
        contactNames.add("Raju");
        contactNames.add("Nanna");
        contactNames.add("Amma");
        System.out.println(contactNames);
        contactNames.add("Rekha");
        contactNames.add("Nagaraju");
        contactNames.remove("Raju");
        System.out.println(contactNames.contains("Raju"));
        System.out.println(contactNames);
    }
    
}

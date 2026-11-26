package Day_4;
import java.util.*;

public class Task_27 {
    
    public static void main(String[] args) {
        // 1. Store employee IDs as keys and department names as values
        TreeMap<Integer, String> empMap = new TreeMap<>();

        // 2. Add new employee records
        empMap.put(103, "IT");
        empMap.put(101, "HR");
        empMap.put(105, "Finance");
        empMap.put(102, "Marketing");
        empMap.put(104, "Operations");

        // 3. Update an employee's department
        int updateId = 102;
        if (empMap.containsKey(updateId)) {
            empMap.put(updateId, "Sales");
            System.out.println("Updated ID " + updateId + " to Sales");
        }

        // 4. Search for an employee using their ID
        int searchId = 103;
        if (empMap.containsKey(searchId)) {
            System.out.println("Found Employee " + searchId + ": " + empMap.get(searchId));
        } else {
            System.out.println("Employee " + searchId + " not found.");
        }

        // 5. Remove an employee record
        empMap.remove(105);
        System.out.println("Removed Employee 105");

        // 6. Display all employees in ascending order of employee IDs
        System.out.println("\nAscending Order:");
        for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Dept: " + entry.getValue());
        }

        // 7. Display employee records in descending order
        System.out.println("\nDescending Order:");
        for (Map.Entry<Integer, String> entry : empMap.descendingMap().entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Dept: " + entry.getValue());
        }

        // 8. Display employees within a given ID range (e.g., 102 to 104 inclusive)
        System.out.println("\nEmployees in Range (102 to 104):");
        Map<Integer, String> rangeMap = empMap.subMap(102, true, 104, true);
        for (Map.Entry<Integer, String> entry : rangeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Dept: " + entry.getValue());
        }

        // Bonus: Using firstKey() and lastKey() as listed in concepts
        System.out.println("\nFirst Employee ID: " + empMap.firstKey());
        System.out.println("Last Employee ID: " + empMap.lastKey());
    }
}
    


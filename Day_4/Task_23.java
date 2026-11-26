package Day_4;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Task_23 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Store student registration IDs for two different events
        Set<String> event1 = new HashSet<>();
        Set<String> event2 = new HashSet<>();

        int choice;
        do {
            System.out.println("\n--- College Event Registration System ---");
            System.out.println("1. Register Student for Event 1");
            System.out.println("2. Register Student for Event 2");
            System.out.println("3. Cancel Registration from Event 1");
            System.out.println("4. Search Student Registration (Event 1)");
            System.out.println("5. Display All Registered IDs (Event 1)");
            System.out.println("6. Total Unique Registrations (Event 1)");
            System.out.println("7. Students Registered for BOTH Events");
            System.out.println("8. Total Unique Students Across Both Events");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // 2 & 3. Allow registration & prevent duplicates using add()
                    System.out.print("Enter Student ID for Event 1: ");
                    String id1 = sc.nextLine();
                    if (event1.add(id1)) {
                        System.out.println("Registered successfully!");
                    } else {
                        System.out.println("Duplicate ID! Student already registered.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID for Event 2: ");
                    String id2 = sc.nextLine();
                    if (event2.add(id2)) {
                        System.out.println("Registered successfully!");
                    } else {
                        System.out.println("Duplicate ID! Student already registered.");
                    }
                    break;

                case 3:
                    // 4. Remove registration using remove()
                    System.out.print("Enter Student ID to cancel from Event 1: ");
                    String removeId = sc.nextLine();
                    if (event1.remove(removeId)) {
                        System.out.println("Registration cancelled.");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 4:
                    // 5. Search registration using contains()
                    System.out.print("Enter Student ID to search in Event 1: ");
                    String searchId = sc.nextLine();
                    if (event1.contains(searchId)) {
                        System.out.println("Student is registered for Event 1.");
                    } else {
                        System.out.println("Student is NOT registered.");
                    }
                    break;

                case 5:
                    // 6. Display all registered student IDs
                    System.out.println("Registered IDs for Event 1: " + event1);
                    break;

                case 6:
                    // 7. Display total unique registrations using size()
                    System.out.println("Total unique registrations in Event 1: " + event1.size());
                    break;

                case 7:
                    // 8. Identify students in BOTH events using retainAll()
                    Set<String> commonStudents = new HashSet<>(event1);
                    commonStudents.retainAll(event2);
                    System.out.println("Students registered for both events: " + commonStudents);
                    break;

                case 8:
                    // Bonus: Union of both events using addAll()
                    Set<String> allUniqueStudents = new HashSet<>(event1);
                    allUniqueStudents.addAll(event2);
                    System.out.println("All unique students across both events: " + allUniqueStudents);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
    


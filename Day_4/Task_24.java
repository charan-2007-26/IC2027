package Day_4;
import java.util.TreeSet;

public class Task_24 {
    
    public static void main(String[] args) {
        // 1. Create a TreeSet to store unique technical skills in alphabetical order
        TreeSet<String> skills = new TreeSet<>();

        // 2. Add initial and new skills (automatically sorted alphabetically)
        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");
        skills.add("Docker"); // Adding a new skill

        // 3. Prevent duplicate skills (TreeSet automatically ignores duplicates)
        skills.add("Java"); 

        // 4. Display skills in alphabetical order
        System.out.println("Available Skills (Alphabetical): " + skills);

        // 5. Remove a skill that is no longer offered
        skills.remove("SQL");
        System.out.println("After removing SQL: " + skills);

        // 6. Search for a particular skill
        String searchSkill = "React";
        if (skills.contains(searchSkill)) {
            System.out.println(searchSkill + " is offered.");
        } else {
            System.out.println(searchSkill + " is not offered.");
        }

        // 7. Display the first and last skill alphabetically
        System.out.println("First Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

        // 8. Display skills in descending alphabetical order
        System.out.println("Skills (Descending Order): " + skills.descendingSet());
    }
}
    


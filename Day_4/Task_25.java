package Day_4;

 import java.util.LinkedHashSet;
import java.util.Set;

public class Task_25 {
    public static void main(String[] args) {
        // 1. Store product names in the order they are viewed (and prevent duplicates)
        Set<String> recentlyViewed = new LinkedHashSet<>();

        // 2. Add newly viewed products
        recentlyViewed.add("Wireless Mouse");
        recentlyViewed.add("Mechanical Keyboard");
        recentlyViewed.add("USB-C Hub");
        recentlyViewed.add("Laptop Stand");

        // 3. Prevent duplicate product names (adding an existing item is ignored)
        recentlyViewed.add("Wireless Mouse");

        // 4. Display recently viewed products in insertion order
        System.out.println("Recently Viewed Products: " + recentlyViewed);

        // 5. Search whether a product was viewed
        String searchItem = "USB-C Hub";
        if (recentlyViewed.contains(searchItem)) {
            System.out.println(searchItem + " was viewed.");
        } else {
            System.out.println(searchItem + " was not viewed.");
        }

        // 6. Remove a product from the recently viewed list
        recentlyViewed.remove("Laptop Stand");
        System.out.println("After removing 'Laptop Stand': " + recentlyViewed);

        // 7. Display the total number of unique viewed products
        System.out.println("Total unique viewed products: " + recentlyViewed.size());
    }
}
    


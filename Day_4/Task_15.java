import java.util.HashMap;
import java.util.Map;

public class Task_15 {
    public static void main(String[] args) {
        // 1. Initialize HashMap (Product ID -> Quantity)
        HashMap<String, Integer> inventory = new HashMap<>();

        // 2. Add new products
        inventory.put("P101", 10);
        inventory.put("P102", 3);
        inventory.put("P103", 0);

        // 3. Update quantity (restock P101 by 5)
        inventory.put("P101", inventory.getOrDefault("P101", 0) + 5);

        // 4. Reduce quantity when sold (sell 2 units of P102)
        String soldId = "P102";
        int soldQty = 2;
        int currentStock = inventory.getOrDefault(soldId, 0);
        if (currentStock >= soldQty) {
            inventory.put(soldId, currentStock - soldQty);
        }

        // 5. Search for a product using its ID
        System.out.println("P101 Stock: " + inventory.get("P101"));

        // 6. Display products with quantities below 5
        System.out.println("Low Stock Products (< 5):");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        // 7. Remove out-of-stock products (quantity == 0)
        inventory.entrySet().removeIf(entry -> entry.getValue() == 0);
    }
}
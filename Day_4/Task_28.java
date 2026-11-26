package Day_4;
import java.util.*;


public class Task_28 {
        public static void main(String[] args) {
        // 1. Store order IDs as keys and order statuses as values (preserves insertion order)
        LinkedHashMap<String, String> orders = new LinkedHashMap<>();

        // 2. Add new customer orders
        orders.put("ORD101", "Preparing");
        orders.put("ORD102", "Preparing");
        orders.put("ORD103", "Packed");
        orders.put("ORD104", "Preparing");

        // 3. Update order status
        updateStatus(orders, "ORD101", "Out for Delivery");
        updateStatus(orders, "ORD102", "Delivered");

        // 4. Search for an order using its ID
        String searchId = "ORD103";
        if (orders.containsKey(searchId)) {
            System.out.println("Found " + searchId + " -> Status: " + orders.get(searchId));
        } else {
            System.out.println("Order " + searchId + " not found.");
        }

        // 5. Cancel an order by removing it
        orders.remove("ORD104");
        System.out.println("\nCancelled order ORD104.");

        // 6. Display all orders in the order they were received
        System.out.println("\n--- Active Orders (In Received Order) ---");
        for (Map.Entry<String, String> entry : orders.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 7. Count how many orders are currently in each status
        Map<String, Integer> statusCounts = new HashMap<>();
        for (String status : orders.values()) {
            statusCounts.put(status, statusCounts.getOrDefault(status, 0) + 1);
        }

        System.out.println("\n--- Order Count by Status ---");
        for (Map.Entry<String, Integer> entry : statusCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Helper method to safely update order status
    public static void updateStatus(LinkedHashMap<String, String> orders, String orderId, String newStatus) {
        if (orders.containsKey(orderId)) {
            orders.put(orderId, newStatus);
        } else {
            System.out.println("Order " + orderId + " does not exist.");
        }
    }
}

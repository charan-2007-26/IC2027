package Day_4;

import java.util.LinkedList;

public class Task_22 {
    public static void main(String[] args) {
        LinkedList<String> customer=new LinkedList<>();
        //Add customers to the service queue.
        customer.add("patient 1");
        customer.add("patient 2");
        customer.add("patient 3");
        customer.add("patient 4");
        customer.add("patient 5");
        customer.add("patient 6");
        customer.add("patient 7");
        //Add emergency customers at the beginning of the queue.
        customer.addFirst("patient 10");
        customer.addLast("patient 1");
        //Display all waiting customers.
        System.out.println(customer);
        System.out.println( customer.peek());
         customer.poll();
         System.out.println(customer);
         //Display the next customer to be served.
         System.out.println("next customer "+customer.peek());
         //Remove a particular customer from the queue.
         customer.remove();
         System.out.println(customer);
         //Display the total number of waiting customers.
         System.out.println("waiting customers "+customer.size());
         //Continue serving customers until the queue becomes empty.
         customer.clear();
         if (customer.isEmpty()) {
            System.out.println("Empty");
            
         }else{
            System.out.println("Non Empty");
         }

    }
    
}

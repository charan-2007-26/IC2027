package Day_4;

import java.util.ArrayList;

public class Task_21 {
    public static void main(String[] args) {
      ArrayList<String> books=new ArrayList<>();
      //Add new books to the library.
      books.add("Tales Talk");
      books.add("king story");
      books.add("Hi Nanna");
      books.add("chinna");
      books.add("chirutha");
      books.add("red Hat"); 
      //Remove books that are damaged or unavailable.
      books.remove("king story");
      //Update an existing book title.
      books.set(3, "Channai express");
      //Search for a book using its title.
     if( books.contains("Tales Talk")){
        System.out.println("Existed");
     } else{
        System.out.println("Not existed");
        
     }//Display all available books.
     System.out.println("Available books");
     for (String string : books) {
        System.out.println(string);
     }
     //Display the total number of books.
     System.out.println("Total no of books :"+books.size());
     System.out.println(books.reversed());
    }
    
}

package Day_2.Tasks21_32;
class Book{
    int bookId;
    String title;
    String author;
    Book(){

    }
    Book(int bookId, String title){
        this.bookId=bookId;
        this.title=title;
    }
    Book(int bookId, String title, String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
    }
    void displayBook(){
        System.out.println("booId :"+bookId+"\ntitle :"+title+"\nauthor :"+author);
    }
}

public class Task_32 {
    public static void main(String[] args) {
        Book book=new Book();
        book.displayBook();
        Book book2=new Book(01, "Ramayana");
        book2.displayBook();
        Book book3=new Book(03, "Mahabaratham", "Vinayaka");
        book3.displayBook();
    }
    
}
 
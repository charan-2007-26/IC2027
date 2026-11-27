import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void displayBook() {
        System.out.println("bookId="+bookId +"->"+"title="+title+"->"+"author="+author+"isAvailable="+isAvailable );
    }
}

class Member {
    int memberId;
    String memberName;

    Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    HashMap<Integer, Member> members = new HashMap<>();

    HashMap<Integer, Integer> issuedBooks =
        new HashMap<>();

    // Add book
    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search book
    void searchBook(int id) {
        for (Book book : books) {
            if (book.bookId == id) {
                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Register member
    void addMember(Member member) {
        if (members.containsKey(member.memberId)) {
            System.out.println("Member already exists!");
            return;
        }

        members.put(member.memberId, member);
        System.out.println("Member registered successfully!");
    }

    // Issue book
    void issueBook(int bookId, int memberId) {

        if (!members.containsKey(memberId)) {
            System.out.println("Member not found!");
            return;
        }

        if (issuedBooks.containsKey(bookId)) {
            System.out.println("Book already issued!");
            return;
        }

        for (Book book : books) {

            if (book.bookId == bookId) {

                if (book.isAvailable) {
                    book.isAvailable = false;
                    issuedBooks.put(bookId, memberId);

                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is not available!");
                }

                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Return book
    void returnBook(int bookId) {

        if (!issuedBooks.containsKey(bookId)) {
            System.out.println("Book was not issued!");
            return;
        }

        for (Book book : books) {
            if (book.bookId == bookId) {
                book.isAvailable = true;
                issuedBooks.remove(bookId);

                System.out.println("Book returned successfully!");
                return;
            }
        }
    }

    // Display members
    void displayMembers() {
        for (Member member : members.values()) {
            System.out.println(
                member.memberId + " - " + member.memberName
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register Member");
            System.out.println("5. Display Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(
                        new Book(id, title, author)
                    );
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    library.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();

                    library.addMember(
                        new Member(mid, name)
                    );
                    break;

                case 5:
                    library.displayMembers();
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int memId = sc.nextInt();

                    library.issueBook(bid, memId);
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 8:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

    }
}
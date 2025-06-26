import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("No record of this book being issued.");
    }
}

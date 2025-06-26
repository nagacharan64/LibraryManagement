import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("The Art of being Alone", "Renuka Gavrani1"));
        library.addBook(new Book("The Rich Dad and Poor Dad", "Robert Kiyosaki"));
        library.addBook(new Book("The Power Of your Subconscious Mind", "Joseph Murphy"));

        while (true) {
            System.out.println("\n1. Show Books\n2. Issue Book\n3. Return Book\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = sc.nextLine();
                    library.issueBook(titleToIssue);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = sc.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

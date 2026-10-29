import java.util.*;
 
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) { super(msg); }
}
 
interface Issuable {
    void issueItem(String member) throws BookNotAvailableException;
    void returnItem();
}
 
abstract class LibraryItem {
    protected int itemId;
    protected String title;
    public LibraryItem(int itemId, String title) { this.itemId = itemId; this.title = title; }
    abstract void displayInfo();
}
 
class Book extends LibraryItem implements Issuable {
    private String author;
    private boolean isIssued;
    private String issuedTo;
 
    public Book(int itemId, String title, String author) {
        super(itemId, title);
        this.author = author;
    }
 
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
 
    public void issueItem(String member) throws BookNotAvailableException {
        if (isIssued) throw new BookNotAvailableException(
            "Book \"" + title + "\" is already issued to " + issuedTo);
        isIssued = true;
        issuedTo = member;
    }
 
    public void returnItem() { isIssued = false; issuedTo = null; }
 
    void displayInfo() {
        System.out.println("ID: " + itemId + " | " + title + " by " + author +
            " | " + (isIssued ? "Issued to " + issuedTo : "Available"));
    }

    // only addition: so "Member's books" prints the title instead of Book@1b6d3586
    public String toString() { return "\"" + title + "\" (ID " + itemId + ")"; }
}
 
class Member {
    private int memberId;
    private String name;
    private ArrayList<Book> borrowed = new ArrayList<>();
 
    public Member(int memberId, String name) { this.memberId = memberId; this.name = name; }
    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public void addBorrowed(Book b) { borrowed.add(b); }
    public void removeBorrowed(Book b) { borrowed.remove(b); }
 
    public void displayBorrowed() {
        System.out.println(name + "'s books: " +
            (borrowed.isEmpty() ? "none" : borrowed));
    }
}
 
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
 
    public void addBook(Book b) { books.add(b); System.out.println("Added: " + b.getTitle()); }
    public void addMember(Member m) { members.add(m); System.out.println("Added: " + m.getName()); }
 
    public Book findBook(int id) {
        for (Book b : books) if (b.getItemId() == id) return b;
        return null;
    }
 
    public Member findMember(int id) {
        for (Member m : members) if (m.getMemberId() == id) return m;
        return null;
    }
 
    public void issueBook(int bookId, int memberId) {
        Book b = findBook(bookId); Member m = findMember(memberId);
        if (b == null || m == null) { System.out.println("Invalid ID."); return; }
        try {
            b.issueItem(m.getName());
            m.addBorrowed(b);
            System.out.println("Issued \"" + b.getTitle() + "\" to " + m.getName());
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
 
    public void returnBook(int bookId, int memberId) {
        Book b = findBook(bookId); Member m = findMember(memberId);
        if (b == null || m == null) { System.out.println("Invalid ID."); return; }
        b.returnItem();
        m.removeBorrowed(b);
        System.out.println("Returned \"" + b.getTitle() + "\"");
    }
 
    public void displayAllBooks() {
        for (Book b : books) b.displayInfo();
    }
}
 
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;
        do {
            System.out.print("\n1.AddBook 2.AddMember 3.Issue 4.Return 5.Display 6.MemberBooks 7.Exit\nChoice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("ID, Title, Author: ");
                    lib.addBook(new Book(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
                    break;
                case 2:
                    System.out.print("ID, Name: ");
                    lib.addMember(new Member(Integer.parseInt(sc.nextLine()), sc.nextLine()));
                    break;
                case 3:
                    System.out.print("BookID, MemberID: ");
                    lib.issueBook(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    System.out.print("BookID, MemberID: ");
                    lib.returnBook(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
                    break;
                case 5:
                    lib.displayAllBooks();
                    break;
                case 6:
                    System.out.print("MemberID: ");
                    Member m = lib.findMember(Integer.parseInt(sc.nextLine()));
                    if (m != null) m.displayBorrowed(); else System.out.println("Not found.");
                    break;
            }
        } while (choice != 7);
        sc.close();
    }
}

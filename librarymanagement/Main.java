package ashraf.librarymanagement;

public class Main {

    public static void main(String[] args) {
        Library library=new Library();
        library.addBook(101, "Java Programming");
        library.addBook(102, "Cprogramming");

        library.issueBook(1, 101);
        library.getIssuedBooks(101);

        library.returnBook(1,101);

        library.getIssuedBooks(101);
    }
}

package ashraf.librarymanagement;
import java.util.*;

class Library {

    Map<Long, Book> books = new HashMap<>();
    Map<Long, List<Book>> memberBooks = new HashMap<>();

    public void addBook(long id, String title) {

        if (books.containsKey(id)) {
            System.out.println("Book already exists");
            return;
        }

        books.put(id, new Book(id, title));
    }

    public void issueBook(long memberId, long bookId) {

        Book book = books.get(bookId);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (book.issued) {
            System.out.println("Book already issued");
            return;
        }

        book.issued = true;

        memberBooks.computeIfAbsent(memberId,
                k -> new ArrayList<>()).add(book);

        System.out.println("Book Issued");
    }

    public void returnBook(long memberId, long bookId) {

        Book book = books.get(bookId);

        if (book == null)
            return;

        book.issued = false;

        List<Book> list = memberBooks.get(memberId);

        if (list != null)
            list.remove(book);
    }

    public void getIssuedBooks(long memberId) {

        List<Book> list = memberBooks.get(memberId);

        if (list == null) {
            System.out.println("No books");
            return;
        }

        for (Book b : list)
            System.out.println(b.title);
    }
}
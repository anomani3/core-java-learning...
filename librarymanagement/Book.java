package ashraf.librarymanagement;

class Book {

    long bookId;
    String title;
    boolean issued;

    Book(long bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }
}

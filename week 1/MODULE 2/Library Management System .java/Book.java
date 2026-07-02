class Book {
    // bookId, title, and author
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Id : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

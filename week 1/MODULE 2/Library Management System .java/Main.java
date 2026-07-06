public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(67, "C", "Dennis Ritchie");
        Book b2 = new Book(38, "C++", "Bjarne Stroustrup");
        Book b3 = new Book(123, "Java", "James Gosling");
        Book b4 = new Book(89, "JavaScript", "Brendan Eich");
        Book b5 = new Book(45, "Python", "Guido van Rossum");

        Book[] book = { b1, b2, b3, b4, b5 };
        Search s = new Search();
        System.out.println("\nUsing Linear Search:");
        // s.linearSearch(book, "Java");
        s.linearSearch(book, "Python");
        System.out.println("\nUsing Binary Search:");
        s.binarySearch(book, "Java");

    }
}

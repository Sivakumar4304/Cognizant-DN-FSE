public class Search {

    void linearSearch(Book[] book, String title) {

        for (int i = 0; i < book.length; i++) {

            if (book[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                book[i].display();
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    void binarySearch(Book[] book, String title) {

        int left = 0;
        int right = book.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result = book[mid].title.compareToIgnoreCase(title);

            if (result == 0) {
                System.out.println("Book Found:");
                book[mid].display();
                return;
            }

            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Book Not Found");
    }

}

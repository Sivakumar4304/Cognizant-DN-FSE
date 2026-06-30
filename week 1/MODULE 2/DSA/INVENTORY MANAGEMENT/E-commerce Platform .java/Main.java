public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Keyboard", "Input");
        Product p2 = new Product(102, "Mouse", "Input");
        Product p3 = new Product(103, "Scanner", "Input");
        Product p4 = new Product(104, "Microphone", "Input");
        Product p5 = new Product(105, "Webcam", "Input");

        Product p6 = new Product(106, "Monitor", "Output");
        Product p7 = new Product(107, "Printer", "Output");
        Product p8 = new Product(108, "Speaker", "Output");
        Product p9 = new Product(109, "Projector", "Output");
        Product p10 = new Product(110, "Headphones", "Output");

        Product products[] = new Product[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 };

        Search sc = new Search();
        sc.linearSearch(products, 105);
        sc.binarySearch(products, 105);
        sc.linearSearch(products, 116);
        sc.binarySearch(products, 116);
    }
}

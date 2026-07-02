public class Main {
    public static void main(String[] args) {

        FutureValue fv = new FutureValue();

        double result;

        // Test Case 1
        result = fv.futureValue(10000, 0.10, 5);
        System.out.println("Present Value : 10000.0");
        System.out.println("Growth Rate : 10.0%");
        System.out.println("Years : 5");
        System.out.printf("Future Value : %.2f%n%n", result);

        // Test Case 2
        result = fv.futureValue(5000, 0.08, 3);
        System.out.println("Present Value : 5000.0");
        System.out.println("Growth Rate : 8.0%");
        System.out.println("Years : 3");
        System.out.printf("Future Value : %.2f%n%n", result);

        // Test Case 3
        result = fv.futureValue(20000, 0.05, 2);
        System.out.println("Present Value : 20000.0");
        System.out.println("Growth Rate : 5.0%");
        System.out.println("Years : 2");
        System.out.printf("Future Value : %.2f%n", result);
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Abhishek", "JR Software Engineer", 45000.60);
        Employee e2 = new Employee(2, "Rohit", "SR Software Engineer", 75632.33);
        Employee e3 = new Employee(3, "Mahesh", "HR", 4247.50);
        Employee e4 = new Employee(4, "Ramesh", "Manager", 100000.00);
        Employee e5 = new Employee(5, "Suresh", "Director", 15145.30);

        Methods m = new Methods();

        // adding
        m.addEmployee(e1);
        m.addEmployee(e2);
        m.addEmployee(e3);
        m.addEmployee(e4);
        m.addEmployee(e5);
        // traversing
        System.out.println("\nAll Employees:");
        m.traverseEmloyee();
        // Searching
        System.out.println("\nSearching Employee:");
        m.searchEmployee(3);

        // Deleting
        System.out.println("\nDeleting Employee:");
        m.deleteEmployee(3);

        // Traversing after deletion
        System.out.println("\nEmployees After Deletion:");
        m.traverseEmloyee();

    }
}

public class Employee {
    int employeeId;
    String employeename;
    String position;
    double salary;

    Employee(int employeeId, String employeename, String position, double salary) {
        this.employeeId = employeeId;
        this.employeename = employeename;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + employeename);
        System.out.println("Position : " + position);
        System.out.println("Salary : " + salary);
    }
}

class Methods {
    Employee employee[] = new Employee[5];
    int count = 0;

    void addEmployee(Employee e) {
        if (count < employee.length) {
            employee[count] = e;
            count++;
            System.out.println("Employee added successfully");
        } else {
            System.out.println("Employee array is full");
        }
    }

    void searchEmployee(int employeeId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employee[i].employeeId == employeeId) {
                employee[i].display();
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Employee not found");
        }
    }

    void traverseEmloyee() {
        for (int i = 0; i < count; i++) {
            employee[i].display();
        }
    }

    void deleteEmployee(int employeeId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employee[i].employeeId == employeeId) {
                for (int j = i; j < count - 1; j++) {
                    employee[j] = employee[j + 1];
                }
                employee[count - 1] = null;
                count--;
                System.out.println("Employee deleted successfully");
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Employee not found");
        }
    }
}

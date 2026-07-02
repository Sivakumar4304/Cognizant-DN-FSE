# Exercise 4: Employee Management System

## Objective
Develop an Employee Management System using arrays to store employee records. The system supports adding, searching, traversing, and deleting employee records efficiently.

---

## Array Representation

An array stores elements in **contiguous memory locations**. Each element can be accessed directly using its index, making retrieval very fast.

### Advantages of Arrays
- Fast access to elements using indexes.
- Easy to implement and understand.
- Efficient memory usage.
- Suitable when the number of elements is fixed.

---

## Employee Class

The `Employee` class contains the following attributes:

- employeeId
- name
- position
- salary

---

## Implementation

The employee records are stored in an array of `Employee` objects.

The following operations are implemented:

### 1. Add Employee
- Adds a new employee to the next available position in the array.

### 2. Search Employee
- Searches an employee using the employee ID.

### 3. Traverse Employees
- Displays all employee records stored in the array.

### 4. Delete Employee
- Deletes an employee by employee ID.
- Remaining employees are shifted one position to the left.

---

## Time Complexity Analysis

| Operation | Time Complexity |
|-----------|-----------------|
| Add | O(1) |
| Search | O(n) |
| Traverse | O(n) |
| Delete | O(n) |

### Explanation

- **Add:** Inserts the employee at the next available index, so it takes constant time.
- **Search:** May need to check every employee until the required employee is found.
- **Traverse:** Visits every employee exactly once.
- **Delete:** Requires searching for the employee and shifting remaining elements.

---

## Limitations of Arrays

- Fixed size; cannot grow dynamically.
- Insertion and deletion require shifting elements.
- Memory may be wasted if the array is not fully utilized.
- Searching is slower for large datasets when using linear search.

---

## When to Use Arrays

Arrays are suitable when:
- The number of records is known in advance.
- Fast index-based access is required.
- Frequent insertions and deletions are not expected.

---

## Conclusion

The Employee Management System successfully performs add, search, traverse, and delete operations using arrays. Arrays provide fast access and simple implementation but are less efficient for frequent insertions and deletions due to their fixed size and element shifting.
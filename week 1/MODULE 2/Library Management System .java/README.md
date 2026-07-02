# Exercise 6: Library Management System

## Objective
Develop a Library Management System that allows users to search for books by their title using Linear Search and Binary Search algorithms.

---

## Search Algorithms

### Linear Search
- Linear Search checks each book one by one until the required title is found.
- It works on both sorted and unsorted data.
- It is simple to implement but slower for large datasets.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

---

### Binary Search
- Binary Search repeatedly divides the search space into two halves.
- It compares the middle element with the target title.
- It requires the book list to be sorted before searching.

**Time Complexity**
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

---

## Book Class

The `Book` class contains the following attributes:

- bookId
- title
- author

---

## Implementation

### Linear Search
- Searches for a book by comparing each book's title with the given title.
- Suitable for small or unsorted datasets.

### Binary Search
- Searches for a book by title using the divide-and-conquer approach.
- The book array is sorted alphabetically by title before performing the search.

---

## Performance Comparison

| Feature | Linear Search | Binary Search |
|---------|---------------|---------------|
| Best Case | O(1) | O(1) |
| Average Case | O(n) | O(log n) |
| Worst Case | O(n) | O(log n) |
| Data Requirement | Sorted or Unsorted | Sorted Only |
| Performance | Slower | Faster |

---

## When to Use

### Linear Search
- Small datasets.
- Unsorted data.
- Simple implementation.

### Binary Search
- Large datasets.
- Data is already sorted.
-  Provides faster searching 

---

## Conclusion

The Library Management System successfully implements both Linear Search and Binary Search to search books by title. Linear Search is easy to implement and works with any dataset, whereas Binary Search provides faster searching when the data is sorted, making it the preferred choice for large collections of books.
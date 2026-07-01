# Exercise 3: Sorting Customer Orders

## Objective
Develop a system to sort customer orders based on their **total price** using different sorting algorithms. Sorting helps prioritize high-value orders, making order processing more efficient in an e-commerce platform.

---

## Sorting Algorithms

### Bubble Sort
- Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- After each pass, the largest element moves to its correct position.
- It is simple to implement but inefficient for large datasets.

**Time Complexity**
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

---

### Insertion Sort
- Insertion Sort builds the sorted array one element at a time.
- Each new element is inserted into its correct position in the already sorted part.
- It performs well for small or nearly sorted datasets.

**Time Complexity**
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

---

### Quick Sort
- Quick Sort selects a pivot element and partitions the array into two parts.
- Elements smaller than the pivot are placed on the left, and larger elements on the right.
- The same process is applied recursively until the array is sorted.

**Time Complexity**
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)

---

### Merge Sort
- Merge Sort divides the array into smaller halves until each sub-array contains one element.
- The sub-arrays are then merged in sorted order.
- It guarantees consistent performance regardless of input order.

**Time Complexity**
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

---

## Classes Used

### Order
Stores the details of each customer order.

**Attributes**
- orderId
- customerName
- totalPrice

### Sorting
Implements:
- Bubble Sort
- Quick Sort

---

## Implementation

### Bubble Sort
- Compares adjacent orders based on `totalPrice`.
- Swaps orders when they are in the wrong order.
- Continues until all orders are sorted.

### Quick Sort
- Chooses the last order as the pivot.
- Partitions the array around the pivot.
- Recursively sorts the left and right partitions.

---

## Performance Comparison

| Feature | Bubble Sort | Quick Sort |
|---------|-------------|------------|
| Best Case | O(n) | O(n log n) |
| Average Case | O(n²) | O(n log n) |
| Worst Case | O(n²) | O(n²) |
| Memory Usage | O(1) | O(log n) (recursive stack) |
| Suitable For | Small datasets | Large datasets |
| Performance | Slow | Fast |

---

## Why Quick Sort is Preferred

- Faster average performance than Bubble Sort.
- Efficient for large datasets.
- Uses divide-and-conquer, reducing unnecessary comparisons.
- Widely used in real-world applications because of its average time complexity of **O(n log n)**.

---

## Conclusion

The customer orders were successfully sorted using **Bubble Sort** and **Quick Sort** based on `totalPrice`. While Bubble Sort is simple and easy to understand, Quick Sort provides significantly better performance for larger datasets, making it the preferred choice in most practical applications.
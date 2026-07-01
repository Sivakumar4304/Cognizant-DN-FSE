# E-commerce Platform Search Function

## Problem Statement

Develop a search functionality for an e-commerce platform to efficiently search products using **Linear Search** and **Binary Search**.

---

## Approach

A `Product` class is created to store product details, and a `Search` class implements both search algorithms. Products are stored in an array for Linear Search and a sorted array for Binary Search.

---

## Big O Notation

Big O notation measures the efficiency of an algorithm as the input size increases.

- **Best Case:** Element found immediately.
- **Average Case:** Element found after a few comparisons.
- **Worst Case:** Element found at the end or not found.

---

## Data Structure Used

**Product[] (Array)**

### Why Array?

An array is used as required by the exercise. Binary Search works on a **sorted array**, making it faster than Linear Search.

---

## Features

- Linear Search
- Binary Search
- Product Search by ID
- Product Display

---

## Time Complexity

| Case | Linear Search | Binary Search |
|------|---------------|---------------|
| Best | O(1) | O(1) |
| Average | O(n) | O(log n) |
| Worst | O(n) | O(log n) |

---

## Space Complexity

- Linear Search: **O(1)**
- Binary Search (Iterative): **O(1)**

---

## Optimization

Binary Search is more efficient than Linear Search because it reduces the search space by half in every step. However, it requires the array to be sorted.

---

## Conclusion

Binary Search is the preferred choice for large datasets due to its faster search performance, while Linear Search is suitable for small or unsorted datasets.
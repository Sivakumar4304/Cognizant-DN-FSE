# Inventory Management System

## Problem Statement 
Develop an inventory management system that can add, update, delete and display products efficiently.
 
---

## Approach

Before writing the code, I identified the operations that the inventory should support:

- Add a new product
- Update an existing product
- Delete a product
- Display all available products

Since every product has a unique **Product ID**, I chose to store the products in a **HashMap<Integer, Product>**. This allows products to be accessed directly using their ID without searching through the entire collection.

To keep the code organized, the project is divided into three classes:

- **Product.java** – Represents a single product with its details.
- **Inventory.java** – Manages all inventory operations.
- **Main.java** – Creates objects and tests the functionality.

---

## Data Structure Used

**HashMap<Integer, Product>**
### Why HashMap?

A **HashMap** was chosen because every product has a unique **Product ID**, which is used as the key.

Compared to an **ArrayList**, a HashMap provides faster access to products. In an ArrayList, searching, updating, or deleting a product requires traversing the list, resulting in **O(n) time complexity**. In contrast, a HashMap directly accesses the product using its key, giving an average **O(1) time complexity** for these operations.

### Time Complexity
| Operation | ArrayList | HashMap |
|----------|-----------|---------|
| Add | O(1) | O(1) |
| Search | O(n) | O(1) |
| Update | O(n) | O(1) |
| Delete | O(n) | O(1) |

### Space Complexity
Both **ArrayList** and **HashMap** require **O(n) space complexity** to store **n** products.

Since the Inventory Management System performs frequent search, update, and delete operations using the **Product ID**, **HashMap** is a more efficient and suitable choice than an **ArrayList**.

---


## Features

- Add a new product
- Update product details
- Delete a product
- Display all products in the inventory

---

## Algorithm

1. Create Product objects.
2. Store each product in a HashMap using the Product ID as the key.
3. Perform add, update, and delete operations using the Product ID.
4. Display all products currently available in the inventory.

---


## Optimization

Using a HashMap eliminates the need to perform a linear search whenever a product needs to be updated or deleted. Since Product IDs are unique, the HashMap provides direct access to the required product, making the application more efficient for large inventories.

---

## Conclusion

This project demonstrates how selecting the appropriate data structure can significantly improve application performance. By using a HashMap, inventory operations become faster and more scalable, making it a suitable choice for managing large numbers of products.
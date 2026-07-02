# Exercise 7: Financial Forecasting

## Objective

Develop a financial forecasting tool that predicts the future value of an investment using a recursive algorithm based on a fixed annual growth rate.

---

## Recursion

Recursion is a programming technique in which a method calls itself to solve a problem. It breaks a large problem into smaller subproblems until a base case is reached.

### Advantages of Recursion

- Simple and easy to understand.
- Reduces code complexity for repetitive problems.
- Useful for divide-and-conquer algorithms.

---

## Implementation

A recursive method is used to calculate the future value of an investment.

**Formula:**

Future Value = Present Value × (1 + Growth Rate)<sup>Years</sup>

### Inputs

- Present Value
- Growth Rate
- Number of Years

### Output

- Predicted Future Value

---

## Algorithm

1. If the number of years is 0, return the present value.
2. Otherwise, recursively calculate the future value for the previous year.
3. Multiply the returned value by `(1 + growthRate)`.
4. Repeat until all years are calculated.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Recursive Calculation | O(n) |

Where **n** is the number of years.

---

## Optimization

The recursive solution creates a function call for every year, increasing memory usage.

It can be optimized by:
- Using an iterative (loop-based) approach.
- Using memoization to avoid repeated calculations if the same values are computed multiple times.

---

## Conclusion

The recursive algorithm successfully predicts the future value of an investment based on a given growth rate. Recursion provides a simple and elegant solution, while iterative methods can be used to improve efficiency for larger inputs.
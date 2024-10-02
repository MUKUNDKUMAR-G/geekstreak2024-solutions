# Missing And Repeating 🔍

## Problem Statement

Given an unsorted array `arr` of positive integers, one number `A` from the set `[1, 2, ..., n]` is missing and one number `B` occurs twice in the array. Your task is to find the missing number `A` and the repeating number `B`.

### Function Description

You need to implement the following function:

```java
class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
    }
}
- Input: An integer array arr[] of size n.
- Output: An array where the first element is the repeating number, and the second is the missing number.
```

### **Input Format**

- A single integer array arr[] where 1 ≤ n ≤ 10^6.

### **Output Format**

- Two integers: the first is the repeating number, and the second is the missing number.

## 📊 Examples

### Example 1

#### Input:

```
arr = [2, 2]
```

**Output:**

```java
2 1
```

### Explanation:

The number 2 is repeated, and 1 is missing.

### Example 2

#### Input

```
arr = [1, 3, 3]
```

**Output:**

```java
3 2

```

#### Explanation:

The number 3 is repeated, and 2 is missing.

## 🧠 Approach's

#### Approach 1 : (Using HashMap):

- Create a HashMap and store the element in it
- iterate the array :
  - check the missing by the index
  - check the repeating number when there value is equal's to 2

#### Approach 2 : (using sum of n natural number and the actual Sum)

- The approach uses the fact that the sum and square sum of the first n natural numbers are known formulas.
- By computing the actual sum and square sum from the array and comparing it with the expected values, we can find the repeating and missing numbers.

#### Approach 3 : (Using X - OR )

- XOR all elements and numbers 1 to n
- Find rightmost set bit in XOR result
- Divide elements into two sets based on set bit
- XOR each set separately

# Time Complexity

**Approach 1:**
O(n).

**Approach 2:**
O(n).

**Approach 3:**
O(n).

# Space Complexity

**Approach 1:**
O(n).

**Approach 2:**
O(1).

**Approach 3:**
O(1).

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

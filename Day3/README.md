# Middle of a Linked List 🔗

## Problem Statement

Given the head of a linked list, the task is to find the middle node.

- For example, the middle of `1 -> 2 -> 3 -> 4 -> 5` is `3`.
- If there are two middle nodes (even count), return the second middle. For example, the middle of `1 -> 2 -> 3 -> 4 -> 5 -> 6` is `4`.

## Function Description

You need to implement the following function:

```java
class Solution {
    int getMiddle(Node head) {
        // Your code here.
    }
}
```

### **Input Format**

- The input is a linked list represented by the head node.

### **Output Format**

- Return the value of the middle node of the linked list.

## 📊 Examples

### Example 1

#### Input:

```
Linked list: 1->2->3->4->5

```

**Output:**

```java
3
```

### Explanation:

![Example1](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700171/Web/Other/blobid0_1721970743.png)

### Example 2

#### Input

```
Linked list: 2->4->6->7->5->1

```

**Output:**

```java
7
```

#### Explanation:

![Example1](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700171/Web/Other/blobid1_1721970760.png)

## 🧠 Approach and Solution

1. Use two pointers, slow and fast. Move slow by one step and fast by two steps.
2. When fast reaches the end, slow will be at the middle of the linked list.

# Time Complexity

O(n)

# Space Complexity

O(1)

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

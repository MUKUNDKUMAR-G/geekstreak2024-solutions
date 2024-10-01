# Binary Tree to Doubly Linked List 🌳➡️🔗

## Problem Statement

![Main](https://www.geeksforgeeks.org/wp-content/uploads/TreeToList.png)
Given a Binary Tree (BT), convert it to a Doubly Linked List (DLL) in place. The left and right pointers in nodes will be used as previous and next pointers respectively in the converted DLL. The order of nodes in the DLL must be the same as the order of the given Binary Tree. The first node of the in-order traversal (leftmost node in BT) must be the head node of the DLL.

### Function Description

You need to implement the following function:

```java
class Solution {
    void TreeToList(Node root) {
        // Your code here.
    }
}
```

### **Input Format**

- A binary tree with nodes having integer values.

### **Output Format**

- The function should return the head of the Doubly Linked List, printed in two orders: forward and backward.

## 📊 Examples

### Example 1

#### Input:

```
     1
    /  \
   3    2
```

**Output:**

```java
3 1 2
2 1 3
```

### Explanation:

![Example 1](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700144/Web/Other/blobid0_1723093893.png)
The DLL would be 3 <-> 1 <-> 2.

### Example 2

#### Input

```
      10
     /   \
   20    30
  /   \
40   60

```

**Output:**

```java
40 20 60 10 30
30 10 60 20 40
```

#### Explanation:

![Example 2](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700144/Web/Other/blobid1_1723093972.png)
The DLL would be 40 <-> 20 <-> 60 <-> 10 <-> 30.

## 🧠 Approach and Solution

1. Perform an inorder traversal of the binary tree.
2. Use the left pointer of each node as the previous pointer in the DLL and the right pointer as the next pointer.
3. Maintain a previous pointer to keep track of the previously visited node.
4. Ensure the head of the DLL is the leftmost node in the binary tree.

# Time Complexity

O(n), where n is the number of nodes in the binary tree.

# Space Complexity

O(h), where h is the height of the tree (used for the recursion stack).

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

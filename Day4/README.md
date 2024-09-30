# Mirror Tree 🌳

## Problem Statement

![Mirror Tree](https://contribute.geeksforgeeks.org/wp-content/uploads/mirrortrees.jpg)
Given a binary tree, convert it into its mirror. The mirror of a binary tree is obtained by swapping the left and right children of all nodes in the tree.

### Function Description

You need to implement the following function:

```java
class Solution {
    void mirror(Node root) {
        // Your code here.
    }
}
```

### **Input Format**

- The input is a binary tree represented by the root node.

### **Output Format**

- The output should be the in-order traversal of the mirrored tree.

## 📊 Examples

### Example 1

#### Input:

```
      1
    /  \
   2    3

```

**Output:**

```java
3 1 2
```

### Explanation:

The original tree:

```1
    /   \
   2     3
```

After converting to its mirror:

```python
      1
    /   \
   3     2
```

The in-order traversal of the mirrored tree is `3 1 2`.

### Example 2

#### Input

```
      10
     /  \
    20   30
   /  \
  40  60

```

**Output:**

```java
30 10 60 20 40
```

#### Explanation:

The original tree:

```10
    /    \
   20    30
  /  \
 40  60
```

After converting to its mirror:

```python
      10
    /    \
   30    20
         /   \
        60   40
```

The in-order traversal of the mirrored tree is `30 10 60 20 40`.

## 🧠 Approach and Solution

- Recursively swap the left and right children of each node.
- Perform an inorder traversal of the mirrored tree to display the result.

# Time Complexity

O(n)

# Space Complexity

O(Height of the Tree)

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

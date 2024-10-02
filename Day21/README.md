# Merge Two BSTs 🌳

## Problem Statement

Given two Binary Search Trees (BSTs), return the elements of the merged BSTs in sorted form.

### Function Description

You need to implement the following function:

```java
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
    }
}
Parameters:
root1 and root2: Nodes representing the roots of two BSTs.
Returns:
A list of integers containing the merged and sorted elements from both trees.
```

### **Input Format**

- Two BSTs, each represented by root nodes root1 and root2.

### **Output Format**

- A sorted list of all node values from both BSTs.

## 📊 Examples

### Example 1

#### Input:

```
BST1:
       5
     /   \
    3     6
   / \
  2   4
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
```

**Output:**

```java
1 2 2 3 3 4 5 6 6 7
```

### Explanation:

After merging and sorting the two BST we get 1 2 2 3 3 4 5 6 6 7.

### Example 2

#### Input

```
BST1:
       12
     /
    9
   / \
  6   11
BST2:
      8
    /  \
   5    10
  /
 2
```

**Output:**

```java
2 5 6 8 9 10 11 12
```

#### Explanation:

After merging and sorting the two BST we get 2 5 6 8 9 10 11 12.

## 🧠 Approach

- **In-order traversal**: Traverse both BSTs to get two sorted arrays.
- **Merge two sorted arrays**: Combine the two sorted arrays into a single sorted list.
- Return the sorted list.

# Time Complexity

O((m + n) log(m + n)), where m and n are the number of nodes in both BSTs.

# Space Complexity

O(m + n) for storing the elements of both BSTs in sorted order.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

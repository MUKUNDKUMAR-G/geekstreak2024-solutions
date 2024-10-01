# Clone a linked list with next and random pointer

## Problem Statement

![Clone a linked list with next and random pointer](https://contribute.geeksforgeeks.org/wp-content/uploads/clone.jpg)
You are given a special linked list where each node has a next pointer pointing to its next node. You are also given some random pointers, where you will be given some pairs denoting two nodes a and b i.e. a->random = b (random is a pointer to a random node).

Construct a copy of the given list. The copy should consist of the same number of new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the original and copied list pointers represent the same list state. None of the pointers in the new list should point to nodes in the original list.

**For example**, if there are two nodes x and y in the original list, where x->random = y, then for the corresponding two nodes xnew and ynew in the copied list, xnew->random = ynew.

Return the head of the copied linked list.

NOTE :

1. If there is any node whose arbitrary pointer is not given then it's by default NULL.
2. Don't make any changes to the original linked list.

### Function Description

You need to implement the following function:

```java
class Node {
    int data;
    Node next, random;

    Node(int d) {
        data = d;
        next = random = null;
    }
}

class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
    }
}
```

### **Input Format**

- A linked list with n nodes where each node contains:
  - An integer data.
  - A pointer next to the next node.
  - A pointer random that can point to any node or be null.

### **Output Format**

- Return the head of the cloned linked list.

## 📊 Examples

### Example 1

#### Input:

```
LinkedList: 1 -> 2 -> 3 -> 4, pairs: [{1,2}, {2,4}]
```

**Output:**

```java
true
```

### Explanation:

In this test case, there are 4 nodes in the linked list. Among these, 2 nodes have their random pointers set. The first node's random pointer points to node 2, and the second node's random pointer points to node 4.

### Example 2

#### Input

```
LinkedList: 1 -> 3 -> 5 -> 9, pairs: [{1,1}, {3,4}]
```

**Output:**

```java
true
```

#### Explanation:

In this test case, the first node's random pointer points to itself, and the third node's random pointer points to node 4.

## 🧠 Approach and Solution

1. Copy Nodes: Iterate through the original list and create a copy of each node. Insert the copied nodes right after the corresponding original nodes.
2. Set Random Pointers: Iterate through the modified list and assign random pointers for the copied nodes.
3. Separate Lists: Restore the original list and extract the cloned list.

# Time Complexity

O(n), where n is the number of nodes in the linked list.

# Space Complexity

O(1), for the pointers used to traverse and manipulate the list (excluding space for the new nodes).

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

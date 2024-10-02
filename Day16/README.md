# Palindrome Linked List 🔗

## Problem Statement

Given a singly linked list of integers, the task is to check if the given linked list is a palindrome. A linked list is considered a palindrome if the sequence of values is the same when read from the front and back.

### Function Description

You need to implement the following function:

```java
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
    }
}

- Function Name: isPalindrome
- Input: A singly linked list with nodes containing integer values.
- Output: Return true if the linked list is a palindrome, otherwise return false.
```

### **Input Format**

- A linked list where each node contains an integer.

### **Output Format**

- A boolean value: true if the linked list is a palindrome, false otherwise.

## 📊 Examples

### Example 1

#### Input:

```
LinkedList: 1->2->1->1->2->1
```

**Output:**

```java
true
```

### Explanation:

![Example1](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700391/Web/Other/blobid0_1722089787.png)
The linked list is the same forward and backward.

### Example 2

#### Input

```
LinkedList: 1->2->3->4
```

**Output:**

```java
false
```

#### Explanation:

![Example2](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700391/Web/Other/blobid1_1722089845.png)
The linked list is not the same forward and backward.

## 🧠 Approach

- Find the middle of the linked list using the fast and slow pointer method.
- Reverse the second half of the linked list.
- Compare the first half and the reversed second half.
- Restore the original list structure (optional but good practice).
- Return true if both halves match, otherwise return false.

# Time Complexity

O(n), where n is the number of nodes in the linked list.

# Space Complexity

O(1), since we are using constant space.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

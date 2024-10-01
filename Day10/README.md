# Reverse Words 🔄

## Problem Statement

Given a string `str`, reverse the string without reversing its individual words. Words are separated by dots (`.`). The last character is not a dot.

### Function Description

You need to implement the following function:

```java
class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
    }
}

- Takes a string str as input.
- Returns the string with the words in reverse order, separated by dots.
```

### **Input Format**

- A single string str, where words are separated by dots.

### **Output Format**

- A string where the words are reversed and separated by dots.

## 📊 Examples

### Example 1

#### Input:

```
str = "i.like.this.program.very.much"
```

**Output:**

```java
much.very.program.this.like.i
```

### Explanation:

Reversing the order of words gives the result.

### Example 2

#### Input

```
str = "pqr.mno"
```

**Output:**

```java
mno.pqr
```

#### Explanation:

Reversing the order of words gives the result.

## 🧠 Approach and Solution

1. Split the string into words using the dot (.) as the delimiter.
2. Reverse the order of the words.

# Time Complexity

O(|str|), where |str| is the length of the string.

# Space Complexity

O(|str|) for storing the words.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me

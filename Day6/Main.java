class Node {
    Node left, right;
    int data;
    
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {
    // Previous node to keep track while converting.
    Node prev = null;
    
    // Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root) {
        if (root == null) {
            return null;
        }
        
        // Create a dummy node for DLL head
        Node head = null;
        
        // Call the recursive helper function
        head = convertToDLL(root);
        
        return head;
    }
    
    // Recursive function to perform inorder traversal and convert tree to DLL.
    Node convertToDLL(Node root) {
        // Base case
        if (root == null) {
            return null;
        }

        // Recursively convert left subtree
        Node head = convertToDLL(root.left);
        
        // Process current node
        if (prev == null) {
            // This is the leftmost node, which will be the head of the DLL
            head = root;
        } else {
            // Adjust the pointers
            root.left = prev;
            prev.right = root;
        }
        // Mark this node as previous before moving to right subtree
        prev = root;
        
        // Recursively convert right subtree
        convertToDLL(root.right);
        
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Creating the binary tree
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        
        // Convert binary tree to DLL
        Node head = sol.bToDLL(root);
        
        // Print the doubly linked list
        printDLL(head);
    }

    // Helper function to print the doubly linked list
    public static void printDLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}

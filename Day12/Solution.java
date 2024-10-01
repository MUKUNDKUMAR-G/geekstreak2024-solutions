import java.util.*;

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
        if (head == null) return null;

        // Step 1: Create a new node for each original node and insert it right next to the original node
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Copy random pointers for the new nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next; // Link the copy node's random pointer
            }
            curr = curr.next.next; // Move to the next original node
        }

        // Step 3: Separate the original and copied linked list
        Node original = head;
        Node copyHead = head.next;
        Node copy = copyHead;

        while (original != null) {
            original.next = original.next.next; // Restore original list
            if (copy.next != null) {
                copy.next = copy.next.next; // Link copy list
            }
            original = original.next;
            copy = copy.next;
        }

        return copyHead;
    }

    // Function to print the linked list
    void printList(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            head = head.next;
        }
    }

    // Main function to test the clone operation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        
        Node head = null;
        Node last = null;

        // Creating the linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                last.next = newNode;
            }
            last = newNode;
        }

        // Setting random pointers
        System.out.println("Enter the random pointers in pairs (format: a b), enter -1 -1 to stop:");
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == -1 && b == -1) break;

            Node nodeA = head;
            Node nodeB = head;
            for (int i = 1; i < a; i++) {
                if (nodeA != null) nodeA = nodeA.next;
            }
            for (int i = 1; i < b; i++) {
                if (nodeB != null) nodeB = nodeB.next;
            }
            if (nodeA != null && nodeB != null) {
                nodeA.random = nodeB;
            }
        }

        // Cloning the linked list
        Solution solution = new Solution();
        Node clonedHead = solution.copyList(head);

        // Print original and cloned linked list
        System.out.println("Original Linked List:");
        solution.printList(head);
        System.out.println("Cloned Linked List:");
        solution.printList(clonedHead);
    }
}

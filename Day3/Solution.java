import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();
        
        System.out.println("Enter the node values:");
        Node head = new Node(scanner.nextInt());
        Node current = head;

        for (int i = 1; i < n; i++) {
            current.next = new Node(scanner.nextInt());
            current = current.next;
        }

        Solution sol = new Solution();
        System.out.println("Middle of the linked list: " + sol.getMiddle(head));
        
        scanner.close();
    }
}

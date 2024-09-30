class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    void mirror(Node node) {
        if (node == null) {
            return;
        }

        // Swap left and right children
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively call mirror for left and right subtrees
        mirror(node.left);
        mirror(node.right);
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the binary tree:");
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];

        System.out.println("Enter the node values (use -1 for null nodes):");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value != -1) {
                nodes[i] = new Node(value);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nodes[i] != null) {
                if (2 * i + 1 < n) {
                    nodes[i].left = nodes[2 * i + 1];
                }
                if (2 * i + 2 < n) {
                    nodes[i].right = nodes[2 * i + 2];
                }
            }
        }

        Solution sol = new Solution();
        sol.mirror(nodes[0]);
        sol.inorder(nodes[0]);
        scanner.close();
    }
}

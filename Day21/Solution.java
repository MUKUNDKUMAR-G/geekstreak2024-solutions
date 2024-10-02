import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {

    // Function to perform in-order traversal and collect elements
    private void inOrderTraversal(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, result);
        result.add(root.data);
        inOrderTraversal(root.right, result);
    }

    // Function to merge two sorted lists into one
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        // Merge the lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        // Append remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        // Append remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }

    // Function to return a list of integers denoting the node values of both BSTs in sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // Get in-order traversal of both BSTs
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        // Merge the two sorted lists
        return mergeSortedLists(list1, list2);
    }

    // Helper function to insert nodes into a BST
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Solution solution = new Solution();
        
        System.out.println("Enter number of nodes for BST 1:");
        int n1 = sc.nextInt();
        Node root1 = null;
        System.out.println("Enter values for BST 1:");
        for (int i = 0; i < n1; i++) {
            root1 = insert(root1, sc.nextInt());
        }
        
        System.out.println("Enter number of nodes for BST 2:");
        int n2 = sc.nextInt();
        Node root2 = null;
        System.out.println("Enter values for BST 2:");
        for (int i = 0; i < n2; i++) {
            root2 = insert(root2, sc.nextInt());
        }

        List<Integer> mergedList = solution.merge(root1, root2);
        System.out.println("Merged BSTs in sorted order: " + mergedList);
        
        sc.close();
    }
}

import java.util.Scanner;

public class Solution {
    static int ALPHABET_SIZE = 26;

    public static boolean circleOfStrings(String[] arr) {
        int[] inDegree = new int[ALPHABET_SIZE];
        int[] outDegree = new int[ALPHABET_SIZE];
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            graph.add(new ArrayList<>());
        }

        for (String s : arr) {
            int start = s.charAt(0) - 'a';
            int end = s.charAt(s.length() - 1) - 'a';
            outDegree[start]++;
            inDegree[end]++;
            graph.get(start).add(end);
        }

        if (!checkDegrees(inDegree, outDegree)) return false;
        return isStronglyConnected(graph, arr[0].charAt(0) - 'a');
    }

    private static boolean checkDegrees(int[] inDegree, int[] outDegree) {
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (inDegree[i] != outDegree[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStronglyConnected(List<List<Integer>> graph, int startNode) {
        boolean[] visited = new boolean[ALPHABET_SIZE];
        dfs(graph, startNode, visited);
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (!graph.get(i).isEmpty() && !visited[i]) return false;
        }

        List<List<Integer>> reverseGraph = reverseGraph(graph);
        Arrays.fill(visited, false);
        dfs(reverseGraph, startNode, visited);
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (!graph.get(i).isEmpty() && !visited[i]) return false;
        }

        return true;
    }

    private static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    private static List<List<Integer>> reverseGraph(List<List<Integer>> graph) {
        List<List<Integer>> reverseGraph = new ArrayList<>();
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            reverseGraph.add(new ArrayList<>());
        }
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            for (int neighbor : graph.get(i)) {
                reverseGraph.get(neighbor).add(i);
            }
        }
        return reverseGraph;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Create an array to store the input strings
        String[] arr = new String[n];

        // Prompt the user to input the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Call the function and print the result
        System.out.println(circleOfStrings(arr) ? 1 : 0);
    }
}

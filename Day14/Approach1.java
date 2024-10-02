import java.util.Scanner;

class Approach1 {
    // Function to find the missing and repeating number
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int i = 0; i <= n; i++){
            
            if(map.containsKey(i) && map.get(i) == 2){
                ans[0] = i;
            }
            if(!map.containsKey(i)){
                ans[1] = i;
            }
            

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solve sol = new Solve();
        int result[] = sol.findTwoElement(arr, n);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}

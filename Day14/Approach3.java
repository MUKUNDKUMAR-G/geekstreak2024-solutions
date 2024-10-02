class Approach3{
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int xor = 0;
        
        // Step 1: XOR all array elements and numbers from 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }
        
        // Step 2: Find a set bit in xor
        int setBit = xor & -xor;
        
        // Step 3: Divide elements into two sets and XOR them
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) != 0)
                x ^= arr[i];
            else
                y ^= arr[i];
                
            if (((i + 1) & setBit) != 0)
                x ^= (i + 1);
            else
                y ^= (i + 1);
        }
        
        // Step 4: Identify which is missing and which is repeating
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) count++;
        }
        
        if (count == 2)
            return new int[]{x, y};
        else
            return new int[]{y, x};
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
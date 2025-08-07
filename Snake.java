public class Snake {
    public static void main(String[] args) {
        
        int arr[][] = {
            {1, 6, 7},
            {9, 18, 15},
            {21, 8, 14}
        };

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
              
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
               
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

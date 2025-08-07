class PathSum {
    public int minPathSum(int[][] grid) {

        int top = 0;
        int bottom = grid.length - 1;
        int left = 0;
        int right = grid[0].length - 1;

        int sum = 0;

        // To avoid infinite loop
        boolean visited = false;

        while (top <= bottom && left <= right && !visited) {
            // Add top row
            for (int i = left; i <= right; i++) {
                sum += grid[top][i];
            }

            // Add right column
            for (int i = top + 1; i <= bottom; i++) {
                sum += grid[i][right];
            }

            visited = true; // So loop doesn't run forever
        }

        return sum;
    }

    public static void main(String[] args) {
        PathSum s = new PathSum();
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println("Sum: " + s.minPathSum(grid));
    }
}

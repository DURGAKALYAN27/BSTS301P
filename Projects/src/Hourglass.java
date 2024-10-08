public class Hourglass {
    public static void main(String[] args) {
        int[][] grid = {{6, 2, 1, 3},{4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}};
        int max = findHourglass(grid);
        System.out.println(max);
    }

    static int findHourglass(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < m-2; i++) {
            for (int j = 0; j < n-2; j++) {
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}

public class Equilibrium {
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Calculate total sum of the array
        for (int k : arr) {
            totalSum += k;
        }

        // Iterate through the array and check for equilibrium points
        for (int j : arr) {
            totalSum -= j; // This is the right sum at index i

            // Check if left sum equals the right sum (equilibrium point)
            if (leftSum == totalSum) {
                maxSum = Math.max(maxSum, leftSum);
            }

            leftSum += j; // Update the left sum for the next iteration
        }

        // If no equilibrium point was found, return 0 or appropriate value
        return (maxSum == Integer.MIN_VALUE) ? 0 : maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
    }
}

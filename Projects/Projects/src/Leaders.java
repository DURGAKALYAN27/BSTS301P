public class Leaders{
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2}; // Sample array
        findLeaders(array); // Call method to find leaders
    }

    public static void findLeaders(int[] array) {
        int length = array.length;
        int max = array[length - 1]; // The last element is always a leader
        System.out.print(max + " "); // Print the last element as a leader

        // Traverse the array from right to left
        for (int i = length - 2; i >= 0; i--) {
            if (array[i] > max) { // If the current element is greater than the max so far
                max = array[i];   // Update the max
                System.out.print(max + " "); // Print the new leader
            }
        }
    }
}

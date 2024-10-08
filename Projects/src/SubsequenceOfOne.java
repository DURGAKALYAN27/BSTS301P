public class SubsequenceOfOne {
    public static void main(String[] args) {
        int n = 1775; // Example input number
        int flip = 1; // Example number of flips allowed (1 flip allowed)
        System.out.println("Longest subsequence of 1s with " + flip + " flip(s): " + checkLS(n, flip));
    }

    static int checkLS(int n, int flip) {
        // Convert number to binary string
        String bs = Integer.toBinaryString(n);
        int sp = 0; // Start pointer of the sliding window
        int ep = 0; // End pointer of the sliding window
        int maxlen = 0; // To store the maximum length of the subsequence

        while (ep < bs.length()) {
            if (bs.charAt(ep) == '0') {
                flip--; // Reduce flips for each '0' encountered
            }

            // If flips are exhausted (flip < 0), we move the start pointer (sp) to shrink window
            while (flip < 0) {
                if (bs.charAt(sp) == '0') {
                    flip++; // Reclaim flip when passing a '0' from the start
                }
                sp++; // Move the start pointer forward
            }

            // Calculate the max length
            maxlen = Math.max(maxlen, ep - sp + 1);
            ep++; // Move the end pointer forward
        }

        return maxlen; // Return the maximum length of subsequence of 1's
    }
}

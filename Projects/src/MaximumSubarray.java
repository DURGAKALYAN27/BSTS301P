public class MaximumSubarray {
    public static void main(String[] args) {
        int[] n = {2, 3, -2, 4, 0, 8, 2};

        System.out.println(maxSub(n));
    }

    static long maxSub(int[] n) {
        long max = 0;
        int len = n.length;
        int prefix = 1, suffix = 1;

        for (int i = 0; i < len; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= n[i];
            suffix *= n[len-1-i];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}

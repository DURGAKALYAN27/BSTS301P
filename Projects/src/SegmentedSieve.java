public class SegmentedSieve {
    static void printPrime(int l, int u) {
        boolean[] prime = new boolean[u + 1];

        for (int i = 2; i*i <= u; i++) {
            int sm = (l/i) * i;

            if (sm < l)
                sm += i;

            for (int j = sm; j < u; j += i) {
                prime[j] = true;
            }
        }

        for (int i = l; i <= u; i++) {
            if (!prime[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int l = 11;
        int u = 50;

        printPrime(l, u);
    }
}

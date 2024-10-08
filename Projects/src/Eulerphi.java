public class Eulerphi {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(phi(n));
    }

    static int phi(int n) {
        int res = n;
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                res -= res/i;
            }
        }

        if (n > 1) {
            res -= 1;
        }

        return res;
    }
}

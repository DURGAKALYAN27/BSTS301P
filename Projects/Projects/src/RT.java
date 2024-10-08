public class RT {
    public static void main(String[] args) {
        int[] div = {3, 5, 7};
        int[] rem = {2, 3, 2};
        int n = 3;

        System.out.println(findX(n, div, rem));
    }

    static int findX(int n, int[] div, int[] rem) {
        int x = 0, i;
        while (true) {
            for (i = 0; i < n; i++) {
                if (x % div[i] != rem[i]) {
                    break;
                }
            }

            if (i == n) {
                break;
            }
            x++;
        }

        return x;
    }
}
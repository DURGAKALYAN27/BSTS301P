public class AliceAppleTree {
    static int findPerimeter(int n) {
        int res = 0;
        int i = 0;
        while (res <= n) {
            i++;
            res += 12 * i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 720;
        System.out.println(findPerimeter(n)*8);
    }
}

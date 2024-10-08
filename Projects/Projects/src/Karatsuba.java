public class Karatsuba {
    public static void main(String[] args) {
        long x = 56;
        long y = 78;
        long res = findProduct(x, y);
        System.out.println(res);
    }

    static long findProduct(long x, long y) {
        if (x < 10 || y < 10) {
            return x*y;
        }

        int len = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (len+1)/2;

        long a = (long)(x / Math.pow(10, half));
        long b = (long)(x % Math.pow(10, half));
        long c = (long)(y / Math.pow(10, half));
        long d = (long)(y % Math.pow(10, half));

        long ac = findProduct(a, c);
        long bd = findProduct(b, d);

        long abcd = findProduct((a+b), (c+d)) - ac - bd;

        return (long)((ac * Math.pow(10, len)) + abcd * Math.pow(10, half) + bd);
    }
}

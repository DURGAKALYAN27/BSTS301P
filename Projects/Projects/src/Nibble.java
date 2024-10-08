public class Nibble {
    static int swapNib(int n) {
        // Shift the lower nibble (last 4 bits) left by 4 and upper nibble right by 4, then combine
        return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        int num = 100; // Example number to swap nibbles
        int result = swapNib(num);
        System.out.println("Swapped Nibble result: " + result);
    }
}

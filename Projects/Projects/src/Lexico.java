public class Lexico {
    public static void main(String[] args) {
        String input = "malayalam";
        Lexico(input); // Test the function with example input
    }

    static void Lexico(String str) {
        int len = str.length();
        int max = 26;
        int[] freq = new int[max];

        // Count the frequency of each character in the input string
        for (int i = 0; i < len; i++) {
            freq[str.charAt(i) - 'a']++;
        }

        // Check if a palindrome can be formed
        if (!CanMakePalindrome(freq, max)) {
            System.out.println("No such string exists");
            System.exit(0);
        }

        String odd_chars = ""; // To store any odd-count characters

        // Prepare for constructing the palindrome
        for (int i = 0; i < max; i++) {
            if (freq[i] % 2 != 0) {
                odd_chars = odd_chars + (char)(i + 'a'); // Store odd character
                freq[i]--; // Reduce frequency to make it even
            }
        }

        String f = "", r = ""; // f: first half, r: reverse half
        for (int i = 0; i < max; i++) {
            if (freq[i] != 0) {
                char ch = (char)(i + 'a');
                String temp = "";
                for (int j = 1; j <= freq[i] / 2; j++) {
                    temp = temp + ch;
                }
                f = f + temp; // Append the temp string to the first half
                r = temp + r; // Prepend the temp string to the reverse half
            }
        }

        // Output the full palindrome by combining first half, odd_chars, and reverse half
        System.out.println(f + odd_chars + r);
    }

    // Utility method to check if a palindrome can be formed
    static boolean CanMakePalindrome(int[] freq, int max) {
        int oddCount = 0;
        for (int i = 0; i < max; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1; // At most one character with an odd frequency is allowed
    }
}

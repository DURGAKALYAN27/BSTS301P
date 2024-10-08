public class KRotations {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        rotateKTimes(arr, k);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void rotateOne(int[] arr) {
        int len = arr.length;
        int temp = arr[0];
        for (int i = 1; i < len; i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
    }

    static void rotateKTimes(int[] arr, int k) {
        if (k > 0) {
            k = k % arr.length;
        }
        else if (k < 0){
            k += arr.length;
        }
        for (int i = 1; i <= k; i++) {
            rotateOne(arr);
        }
    }
}

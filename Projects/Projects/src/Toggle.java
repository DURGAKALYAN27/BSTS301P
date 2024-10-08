public class Toggle {
    public static void main(String[] args) {
        int n = 100;
        toggleDoors(n);
    }

    static void toggleDoors(int n) {
        boolean[] doors = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j+=i) {
                doors[j] = !doors[j];
            }
        }

        int closed = 0, open = 0;
        for (int i = 1; i <= n; i++) {
            if (doors[i]) {
                closed++;
                System.out.println(i);
            }
            else
                open++;
        }

        System.out.println("Closed: " + closed);
        System.out.println("Open: " + open);
    }
}
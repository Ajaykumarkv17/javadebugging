public class diagonalpatt {
    public static void main(String[] args) {
        int n = 5, x, y, i, j, k = 1;
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            x = i;
            y = 0;
            while (x >= 0) {
                a[x][y] = k++;
                x--;
                y++;
            }
        }
        for (i = 1; i < n; i++) {
            x = n - 1;
            y = i;
            while (y <= n - 1) {
                a[x][y] = k++;
                x--;
                y++;
            }
        }

        for (int l = 0; l < n; l++) {

            for (int r = 0; r < n; r++) {
                System.out.print(a[l][r] + " ");
            }

            System.out.println();
        }
    }
}

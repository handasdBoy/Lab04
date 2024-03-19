public class JPA403 {
        public static void printArray(int[][] array) {
        int m = array.length;
        int n = array[0].length;       
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] addArrays(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("陣列A的內容為(3x3):");
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {10, 11, 12}};
        printArray(a);
        System.out.println("陣列B的內容為(3x3):");
        printArray(b);
        System.out.println("陣列A+B=C，陣列C的內容為(3x3):");
        int[][] c = addArrays(a, b);
        printArray(c);
    }
}
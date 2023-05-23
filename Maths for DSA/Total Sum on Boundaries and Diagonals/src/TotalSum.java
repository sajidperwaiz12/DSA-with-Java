import java.util.*;
import java.io.*;

public class TotalSum {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        byte nextByte() {
            return Byte.parseByte(next());
        }

        short nextShort() {
            return Short.parseShort(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        boolean nextBoolean() {
            String str = in.next();
            if (str.matches("true")) {
                return true;
            } else {
                return false;
            }
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) {
            try {
                bw.append("" + object);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void println(Object object) {
            print(object);
            try {
                bw.append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void flush() {
            try {
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            int[][] arr = takeInput();
            totalSum(arr);
        }
    }

    public static int[][] takeInput() {
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public static void totalSum(int[][] mat) {
        //Your code goes here
        if (mat.length == 0) {
            out.println("0");
            out.flush();
            return;
        }
        int total = getBoundarySum(mat) + getFirstDiagonalSum(mat) + getSecondDiagonalSum(mat);
        if (mat.length % 2 != 0) {
            total -= mat[mat.length / 2][mat.length / 2];
        }
        out.println(total);
        out.flush();
    }

    public static int getFirstDiagonalSum(int[][] arr) {
        int row = 0;
        int col = 0;
        int sum = 0;
        while (row < arr.length && col < arr[0].length) {
            sum += arr[row][col];
            row++;
            col++;
        }
        return sum;
    }

    public static int getSecondDiagonalSum(int[][] arr) {
        int row = 0;
        int col = arr[0].length - 1;
        int sum = 0;
        while (row < arr.length && col >= 0) {
            sum += arr[row][col];
            row++;
            col--;
        }
        return sum;
    }

    public static int getBoundarySum(int[][] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[0][i];                       // Upper Boundary
            sum += arr[arr[0].length - 1][i];       // Lower Boundary
            sum += arr[i][0];                       // Right Boundary
            sum += arr[i][arr.length - 1];          // Left Boundary
        }
        return sum;
    }
}

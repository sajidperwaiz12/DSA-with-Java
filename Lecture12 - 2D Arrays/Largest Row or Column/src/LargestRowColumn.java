import java.util.*;
import java.io.*;

public class LargestRowColumn {
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
            findLargest(arr);
        }
    }

    public static int[][] takeInput() {
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public static void findLargest(int mat[][]){
        //Your code goes here
        int largest = Integer.MIN_VALUE;
        int index = -1;
        boolean isRow = true;

        if (mat.length == 0) {
            return;
        }

        for (int rows = 0; rows < mat.length; rows++) {
            int rowSum = 0;
            for (int cols = 0; cols < mat[rows].length; cols++) {
                rowSum += mat[rows][cols];
            }
            if (rowSum > largest) {
                largest = rowSum;
                index = rows;
            }
        }

        for (int cols = 0; cols < mat[0].length; cols++) {
            int colSum = 0;
            for (int rows = 0; rows < mat.length; rows++) {
                colSum += mat[rows][cols];
            }
            if (colSum > largest) {
                largest = colSum;
                index = cols;
                isRow = false;
            }
        }

        if (isRow) {
            out.println("row " + index + " " + largest);
        } else {
            out.println("column " + index + " " + largest);
        }

        out.flush();
    }
}

import java.util.*;
import java.io.*;

public class SpiralPrint {
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
            spiralPrint(arr);
        }
    }

    public static int[][] takeInput() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        if (matrix.length == 0) {
            return;
        }

        int rs = 0, re = matrix.length - 1;
        int cs = 0, ce = matrix[0].length - 1;
        int count = 0;
        int numsElement = matrix.length * matrix[0].length;

        while (count < numsElement) {
            for (int i = cs; count < numsElement && i <= ce; i++) {
                out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;

            for (int i = rs; count < numsElement && i <= re; i++) {
                out.print(matrix[i][ce] + " ");
                count++;
            }
            ce--;

            for (int i = ce; count < numsElement && i >= cs; i--) {
                out.print(matrix[re][i] + " ");
                count++;
            }
            re--;

            for (int i = re; count < numsElement && i >= rs; i--) {
                out.print(matrix[i][cs] + " ");
                count++;
            }
            cs++;
        }

        out.println("");
        out.flush();
    }
}

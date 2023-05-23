import java.util.*;
import java.io.*;

public class ReturnSubset {
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
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[][] ans = subsets(arr);
        for (int[] a: ans) {
            for (int ele: a) {
                out.print(ele + " ");
            }
            out.println("");
        }

        out.flush();
    }

    public static int[][] subsets(int input[]) {
        // Write your code here
       return subsets(input, 0);
    }

    public static int[][] subsets(int[] input, int si) {
        if (si == input.length) {
            return new int[1][0];
        }

        int[][] smallAns = subsets(input, si + 1);
        int[][] ans = new int[2 * smallAns.length][];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[k][j] = smallAns[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = new int[smallAns[i].length + 1];
            ans[k][0] = input[si];
            for (int j = 1; j <= smallAns[i].length; j++) {
                ans[k][j] = smallAns[i][j - 1];
            }
            k++;
        }

        return ans;
    }
}

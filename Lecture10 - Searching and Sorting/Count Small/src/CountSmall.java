import java.io.*;
import java.util.*;

public class CountSmall {
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
    }

    static FastReader in = new FastReader();
    static FastWriter out = new FastWriter();

    public static int[] takeInput() {
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int ele: arr) {
            out.print(ele + " ");
        }
        out.println("");
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            int[] a = takeInput();
            int[] b = takeInput();
            int[] arr = countS(a.length, b.length, a, b);
            printArray(arr);
        }
        out.close();
    }

    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        Arrays.sort(b);
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            int index = index(b, a[i]);
            arr[k++] = index;
        }
        return arr;
    }

    public static int index(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                ans = mid;
                si = mid + 1;
            }
        }

        return si;
    }
}

import java.io.*;
import java.util.*;
public class Search {
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

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 30, 100, 130, 140, 160, 170};
        int target = 160;
        out.println(ans(arr, target));
        out.close();
    }

    public static int ans(int[] arr, int target) {
        int si = 0;
        int ei = 1;

        while (target > arr[ei]) {
            int newSi = ei + 1;
            ei = ei + (ei - si + 1) * 2;
            si = newSi;
        }

        return binarySearch(arr, target, si, ei);
    }

    public static int binarySearch(int[] arr, int target, int si, int ei) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }
}

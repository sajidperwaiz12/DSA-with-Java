import java.util.*;
import java.io.*;

public class Keypad {
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
        out.println(Arrays.toString(keypad(n)));
        out.flush();
    }

    public static String[] keypad(int n){
        // Write your code here
        if (n == 0 || n == 1) {
            return new String[]{""};
        }

        String[] smallAns = keypad(n / 10);
        int num = n % 10;
        String[] help = helper(num);
        String[] ans = new String[smallAns.length * help.length];
        int k = 0;
        for (int i = 0; i < help.length; i++) {
            for (int j = 0; j < smallAns.length; j++) {
                ans[k++] = smallAns[j] + help[i];
            }
        }

        return ans;
    }

    public static String[] helper(int n) {
        if (n == 0 || n == 1) {
            return new String[]{""};
        }
        switch (n) {
            case 2:
                return new String[]{"a", "b", "c"};

            case 3:
                return new String[]{"d", "e", "f"};

            case 4:
                return new String[]{"g", "h", "i"};

            case 5:
                return new String[]{"j", "k", "l"};

            case 6:
                return new String[]{"m", "n", "o"};

            case 7:
                return new String[]{"p", "q", "r", "s"};

            case 8:
                return new String[]{"t", "u", "v"};

            case 9:
                return new String[]{"w", "x", "y", "z"};
        }
        return new String[]{""};
    }
}

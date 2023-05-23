import java.util.*;
import java.io.*;

public class Functions {
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
        String str1 = "test string";

        // Length of a string
        out.println(str1.length());

        // Index of character -- it will give first occurrence of the character
        out.println(str1.indexOf('s'));

        // character at any index
        out.println(str1.charAt(3));

        // Compare two strings
        out.println(str1.compareTo("Test string"));
        // CompareTo -- ignore case
        out.println(str1.compareToIgnoreCase("Test string"));

        // to check if particular string is present in the given string
        out.println(str1.contains("ing"));

        // to find whether a string ends with a particular index or not
        out.println(str1.endsWith("g"));

        // replace string
        out.println(str1.replace("test", "sample"));

        // lowercase
        out.println(str1.toLowerCase());

        // uppercase
        out.println(str1.toUpperCase());


        out.close();
    }
}

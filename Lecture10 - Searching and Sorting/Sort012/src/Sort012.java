import java.util.*;
import java.io.*;

public class Sort012 {
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

    public static void sort012(int[] arr){
        //Your code goes here
        int i = 0;
        int nextZero = 0;
        int nextTwo = arr.length - 1;

        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                i++;
                nextZero++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;
                nextTwo--;
            }
        }
    }

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
        out.close();
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            sort012(arr);
            printArray(arr);
        }
    }
}

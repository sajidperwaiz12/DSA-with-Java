import java.io.*;

public class LinearSearch {
    static class FastReader {
        BufferedReader br;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        int nextInt() throws IOException {
            return Integer.parseInt(br.readLine());
        }

        long nextLong() throws IOException {
            return Long.parseLong(br.readLine());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(br.readLine());
        }

        byte nextByte() throws IOException {
            return Byte.parseByte(br.readLine());
        }

        short nextShort() throws IOException {
            return Short.parseShort(br.readLine());
        }

        float nextFloat() throws IOException {
            return Float.parseFloat(br.readLine());
        }

        char nextChar() throws IOException {
            return (char) br.readLine().charAt(0);
        }

        String nextString() throws IOException {
            return br.readLine();
        }

        boolean nextBoolean() throws IOException {
            String str = in.nextString();
            if (str.matches("true")) {
                return true;
            } else {
                return false;
            }
        }

        int[] nextIntLine() throws IOException {
            int size = in.nextInt();
            int[] arr = new int[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            return arr;
        }

        long[] nextLongLine() throws IOException {
            int size = in.nextInt();
            long[] arr = new long[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(nums[i]);
            }
            return arr;
        }

        float[] nextFloatLine() throws IOException {
            int size = in.nextInt();
            float[] arr = new float[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Float.parseFloat(nums[i]);
            }
            return arr;
        }

        double[] nextDoubleLine() throws IOException {
            int size = in.nextInt();
            double[] arr = new double[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(nums[i]);
            }
            return arr;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static FastReader in = new FastReader();

    static FastWriter out = new FastWriter();

    public static void main(String[] args) throws IOException {
        int[] arr = in.nextIntLine();
        int x = in.nextInt();
        out.println(linearSearch(arr, x));
        out.close();

    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

import java.io.*;

public class Main {
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

        int[] nextIntLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            int[] arr = new int[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            return arr;
        }

        long[] nextLongLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            long[] arr = new long[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(nums[i]);
            }
            return arr;
        }

        float[] nextFloatLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            int length = nums.length;
            float[] arr = new float[length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Float.parseFloat(nums[i]);
            }
            return arr;
        }

        double[] nextDoubleLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            int length = nums.length;
            double[] arr = new double[length];
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

    public static int[] takeInput() throws IOException {
        int size = in.nextInt();
        int[] arr = in.nextIntLine();
        return arr;
    }

    public static void printArray(int[] arr) throws IOException {
        for (int ele: arr) {
            out.print(ele + " ");
        }
        out.println("");
    }

    public static void main(String[] args) throws IOException {
        int t = in.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            printArray(arr);
        }
        out.close();
    }
}
import java.io.*;

public class BinarySearch {
    // FastReader class for taking input
    static class FastReader {
        BufferedReader br;

        // It will create the object of BufferedReader class
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        // for taking input of type integer
        int nextInt() throws IOException {
            return Integer.parseInt(br.readLine());
        }

        // for taking input of type long
        long nextLong() throws IOException {
            return Long.parseLong(br.readLine());
        }

        // for taking input of type double
        double nextDouble() throws IOException {
            return Double.parseDouble(br.readLine());
        }

        // for taking input of type byte
        byte nextByte() throws IOException {
            return Byte.parseByte(br.readLine());
        }

        // for taking input of type short
        short nextShort() throws IOException {
            return Short.parseShort(br.readLine());
        }

        // for taking input of type float
        float nextFloat() throws IOException {
            return Float.parseFloat(br.readLine());
        }

        // for taking input of type character
        char nextChar() throws IOException {
            return (char) br.readLine().charAt(0);
        }

        // for taking input of type string
        String nextString() throws IOException {
            return br.readLine();
        }

        // for taking input of type boolean
        boolean nextBoolean() throws IOException {
            String str = in.nextString();
            if (str.matches("true")) {
                return true;
            } else {
                return false;
            }
        }

        // for taking integer array input
        int[] nextIntLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            int[] arr = new int[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            return arr;
        }

        // for taking long array input
        long[] nextLongLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            long[] arr = new long[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(nums[i]);
            }
            return arr;
        }

        // for taking float array input
        float[] nextFloatLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            float[] arr = new float[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Float.parseFloat(nums[i]);
            }
            return arr;
        }

        // for taking double array input
        double[] nextDoubleLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            double[] arr = new double[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(nums[i]);
            }
            return arr;
        }

        // for taking char array input
        char[] nextCharLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            char[] arr = new char[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[i].charAt(0);
            }
            return arr;
        }

        // for taking string array input
        String[] nextStringLine() throws IOException {
            String[] nums = br.readLine().split("\\s+");
            String[] arr = new String[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[i];
            }
            return arr;
        }
    }

    // FastWriter class for printing output
    static class FastWriter {
        private final BufferedWriter bw;

        // This will create object of BufferedWriter class
        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        // for printing object in same line
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        // for printing object in different line
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        // Make sure to close BufferedWriter object
        public void close() throws IOException {
            bw.close();
        }
    }

    // Method to create object of FastReader class
    static FastReader in = new FastReader();

    // Method to create object of FastWriter class
    static FastWriter out = new FastWriter();

    public static int[] takeInput() throws IOException {
        int n = in.nextInt();
        int[] arr = in.nextIntLine();
        return arr;
    }

    public static int binarySearch(int[] arr, int x) {
        int si = 0;
        int ei = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (x > arr[mid]) {
                si = mid + 1;
            } else if (x < arr[mid]) {
                ei = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = takeInput();
        int x = in.nextInt();
        out.println(binarySearch(arr, x));
        out.close();
    }
}

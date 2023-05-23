public class DynamicArray {
    private int[] data;

    public DynamicArray() {
        data = new int[5];
    }

    public int size() {
        return data.length;
    }

    public void add(int element, int index) {
        if (index == data.length) {
            restructure();
        }
        data[index] = element;
    }

    public void set(int index, int element) {
        if (index < data.length) {
            data[index] = element;
        } else {
            add(element, index);
        }
    }

    public int get(int index) {
        if (index >= data.length) {
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void restructure() {
        int[] temp = data;
        data = new int[data.length * 2];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
}

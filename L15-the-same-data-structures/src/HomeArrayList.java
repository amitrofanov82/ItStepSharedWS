public class HomeArrayList {

    private int[] array;
    private int size;

    public HomeArrayList(int sizeReserve) {
        array = new int[sizeReserve];
        size = 0;
    }

    public int get(int idx) {
        if (idx >= size) {
            return -1;
        } else {
            return array[idx];
        }
    }

    public void set(int value, int idx) {
        array[idx] = value;
        if (idx >= size) {
            size = idx + 1;
        }
    }

    public int size() {
        return this.size;
    }

    public void addFirst(int value) {
        size++;
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
    }

    public void addLast(int value) {
        size++;
        array[size - 1] = value;
    }


    public void insertBefore(int value, int idx) {
        size++;
        for (int i = size - 1; i >= idx; i--) {
            array[i] = array[i - 1];
        }
        array[idx] = value;
    }

    public void remove(int idx) {
        for (int j = idx; j < size; j++) {
            array[j] = array[j + 1];
        }
        size--;
    }

}


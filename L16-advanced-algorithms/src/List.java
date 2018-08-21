
public class List {

    private Element firstElement;
    private Element lastElement;

    public void addLast(int value) {
        Element exm = new Element();
        exm.value = value;
        if (firstElement == null) {
            exm.idx = 0;
            firstElement = exm;
            lastElement = exm;
        } else {
            exm.idx = lastElement.idx + 1;
            lastElement.next = exm;
            lastElement = exm;

        }
    }

    public void addFirst(int value) {
        Element exm = new Element();
        exm.value = value;
        if (firstElement == null) {
            exm.idx = 0;
            firstElement = exm;
            lastElement = exm;
        } else {
            exm.idx = -1;
            exm.next = firstElement;
            firstElement = exm;
            while (exm != null) {
                exm.idx++;
                exm = exm.next;
            }
        }
    }

    public void print() {
        Element exm = firstElement;
        while (exm != null) {
            System.out.print(exm.value + "|");
            exm = exm.next;
        }
        System.out.println();
    }


    public int size() {
        if (lastElement == null) {
            return 0;
        } else {
            return lastElement.idx + 1;
        }
    }


    public int get(int idx) {
        Element exm = firstElement;
        while (exm.idx != idx) {
            exm = exm.next;
        }
        return exm.value;
    }


    public void set(int value, int idx) {
        Element exm = firstElement;
        while (exm.idx != idx) {
            exm = exm.next;
        }
        exm.value = value;
    }


    public void insertBefore(int value, int idx) {
        if (idx == 0) {
            addFirst(value);
        } else {
            Element exm = new Element();
            exm.value = value;
            exm.idx = idx;
            Element exm2 = firstElement;
            while (exm2.idx != idx - 1) {
                exm2 = exm2.next;
            }
            exm.next = exm2.next;
            exm2.next = exm;
            exm2 = exm.next;
            while (exm2 != null) {
                exm2.idx++;
                exm2 = exm2.next;
            }
        }
    }


    public void remove(int idx) {
        Element exm = firstElement;
        if (idx == 0) {
            firstElement = exm.next;
            firstElement.idx = 0;
            exm = firstElement;
        } else {
            while (exm.next.idx != idx) {
                exm = exm.next;
            }
            exm.next = exm.next.next;
        }
        if (exm.next == null) {
            lastElement = exm;
        } else {
            exm = exm.next;
            while (exm != null) {
                exm.idx--;
                exm = exm.next;
            }
        }

    }


    public class Element {

        public int value;
        public int idx;
        public Element next;

    }
}


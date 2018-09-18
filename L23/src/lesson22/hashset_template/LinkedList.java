package lesson22.hashset_template;
public class LinkedList {

    private Element firstElement;
    private int size = 0;

    public void addLast(Object o) {
        Element exm = new Element();
        exm.object = o;
        if (firstElement == null) {
            firstElement = exm;
            size++;
        } else {
            Element last = firstElement;
            while (last.next != null){
                last = last.next;
            }
            last.next = exm;
            size++;
        }
    }

    public void addFirst(Object o) {
        Element exm = new Element();
        exm.object = o;
        if (firstElement == null) {
            firstElement = exm;
            size++;
        } else {
            exm.next = firstElement;
            firstElement = exm;
            size++;
        }
    }

    public int size() {
        return this.size;
    }

    public Object get(int idx) {
        Element exm = firstElement;
        for (int i = 0; i < idx; i++) {
            exm = exm.next;
        }
        return exm.object;
    }

    public void set(Object o, int idx) {
        Element exm = firstElement;
        for (int i = 0; i < idx; i++) {
            exm = exm.next;
        }
        exm.object = o;
    }


    public void insertBefore(Object o, int idx) {
        if (idx == 0) {
            addFirst(o);
        } else {
            Element exm = new Element();
            exm.object = o;
            Element exmBefore = firstElement;
            for (int i = 0; i < idx - 1; i++) {
                exmBefore = exmBefore.next;
            }
            exm.next = exmBefore.next;
            exmBefore.next = exm;
            size++;
        }
    }


    public void remove(int idx) {
        Element exmBeforeDel = firstElement;
        if (idx == 0) {
         firstElement = exmBeforeDel.next;
         size--;
        } else {
            for (int i = 0; i < idx - 1; i++) {
                exmBeforeDel = exmBeforeDel.next;
            }
            exmBeforeDel.next = exmBeforeDel.next.next;
            size--;
        }
    }


    public class Element {

        public Object object;
        public Element next;

    }
}


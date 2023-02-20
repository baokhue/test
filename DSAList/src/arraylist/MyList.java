package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList (int size) {
        elements = new Object[size];
    }

    public void ensureCapa () {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add (E e){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void remove (int E) {

    }
}

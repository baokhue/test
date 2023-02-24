package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTS = {};

    private int size = 0;

    private Object[] elements;

    public MyList() {
        this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            this.elements = new Object[capacity];
        } else if (capacity == 0) {
            this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTS;
        } else throw new IllegalArgumentException("Gia tri khong hop le!");
    }

    public void setElements(E[] newElements) {
        this.elements = new Object[newElements.length];
        for (int i = 0; i < newElements.length; i++) {
            this.elements[i] = newElements[i];
        }
    }

    public E[] getElements() {
        return (E[]) this.elements;
    }

    public void add(int index, E element) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            Object[] elementsTemp = new Object[size];
            for (int i = 0; i < size; i++) {
                elementsTemp[i] = elements[i];
            }
            this.elements = new Object[size + 1];

            for (int i = 0; i < size + 1; i++) {
                if (i > index) {
                    this.elements[i] = elementsTemp[i - 1];
                } else if (i == index) {
                    this.elements[i] = element;
                } else {
                    this.elements[i] = elementsTemp[i];
                }
            }
        }
    }

    public E remove(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else if (index >= 0 && index < this.size()) {
            Object[] elementsTemp = new Object[size];
            for (int i = 0; i < size; i++) {
                elementsTemp[i] = elements[i];
            }
            this.elements = new Object[size - 1];
            for (int i = 0; i < size - 1; i++) {
                if (i < index) {
                    this.elements[i] = elementsTemp[i];
                } else {
                    this.elements[i] = elementsTemp[i + 1];
                }
            }
            return (E) elementsTemp[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public int size() {
        return size = this.elements.length;
    }

    public E[] clone() {
        Object[] cloneElements = new Object[size];
        for (int i = 0; i < size; i++) {
            cloneElements[i] = this.elements[i];
        }
        return (E[]) cloneElements;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (Object e : this.elements) {
            if (o.equals(e)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(this.elements[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E o) {
        Object[] elementsTemp = new Object[size];
        for (int i = 0; i < size; i++) {
            elementsTemp[i] = this.elements[i];
        }
        this.elements = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            this.elements[i] = elementsTemp[i];
        }
        this.elements[size] = o;
        return true;
    }

    public E get(int index) {
        if(index<0) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else if (index >= 0 && index < size){
            return (E) this.elements[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void clear() {
        this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTS;
    }

    public String toString() {
        String str = "[";
        for (Object o : this.elements) {
            str += o + ", ";
        }
        str += "]";
        return str;
    }
}

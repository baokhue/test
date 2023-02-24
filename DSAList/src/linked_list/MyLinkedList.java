package linked_list;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node first;
    private Node last;

    public MyLinkedList() {
    }

    public MyLinkedList(Node newFirst) {
        this.first = newFirst;
    }

    public void addFirst(E e) {
        if (first == null) {
            this.first = new Node(e);
        } else {
            Node tempNode = this.first;
            this.first = new Node(e);
            this.first.next = tempNode;
        }
    }

    public void addLast(E e) {
        if (first == null) {
            this.addFirst(e);
        } else {
            Node current = first;
            while (true) {
                if (current.next == null) {
                    this.last = current;
                    this.last.next = new Node(e);
                    break;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public void add(int index, E e) {
        if (index == 0) {
            this.addFirst(e);
        } else if (index >= this.size()) {
            this.addLast(e);
        } else {
            Node current = this.first;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node tempNode = current.next;
            current.next = new Node(e);
            current.next.next = tempNode;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        } else {
            Node current = this.first;
            Node removeNode;

            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            removeNode = current.next;
            current.next = current.next.next;
            return (E) removeNode;
        }
    }


    public int size() {
        int count = 0;
        if (first == null) {
            count = 0;
        } else {
            Node current = first;
            count = 1;
            while (current.next != null) {
                count++;
                current = current.next;
            }
        }
        return count;
    }

    public String toString() {
        String str = "[";
        if (this.size() == 0) {
            str += "]";
        } else {
            Node current = this.first;
            str += current.toString() + ", ";
            while (current.next != null) {
                str += current.next.toString() + ", ";
                current = current.next;
            }
            str += "]";
        }
        return str;
    }
}

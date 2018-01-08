package com.github.ipan7;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 08/01/18
 * Time: 11:09
 * Project javacircularsinglylinkedlist
 * Package com.github.ipan7
 */
public class LinkedList {
    private Node start;
    private Node end;
    public int size;

    public LinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val) {
        Node nptr = new Node(val, null);
        nptr.setLink(start);

        if (isEmpty()) {
            start = nptr;
            nptr.setLink(start);
            end = start;
        } else {
            end.setLink(nptr);
            start = nptr;
        }

        size++;
    }

    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null);
        nptr.setLink(start);

        if (isEmpty()) {
            start = nptr;
            nptr.setLink(start);
            end = start;
        } else {
            end.setLink(nptr);
            end = nptr;
        }

        size++;
    }

    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(val, null);
        Node ptr = start;

        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
        }
        size++;
    }

    public void deleteAtPos(int pos) {
        if (size == pos && pos == 1) {
            start = null;
            end = null;
            size = 0;
            return;
        }

        if (pos == 1) {
            start = start.getLink();
            end.setLink(start);
            size--;
            return;
        }

        if (pos == size) {
            Node s = start;
            Node t = start;

            while (s != end) {
                t = s;
                s = s.getLink();
            }

            end = t;
            end.setLink(start);
            size--;
            return;
        }

        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (pos == 1) {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }

    public void display() {
        System.out.print("\n Curcular Singly Linked List : ");
        Node ptr = start;

        if (size == 0) {
            System.out.println("Empty");
            return;
        }

        if (start.getLink() == start) {
            System.out.println(start.getData() + "=>" + ptr.getData());
            return;
        }

        System.out.println(start.getData() + "=>");
        ptr = start.getLink();
        while (ptr.getLink() != start) {
            System.out.println(ptr.getData() + "=>");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData() + "=>");
        ptr = ptr.getLink();
        System.out.println(ptr.getData());


    }
}

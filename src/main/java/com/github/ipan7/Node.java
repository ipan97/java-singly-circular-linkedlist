package com.github.ipan7;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 08/01/18
 * Time: 11:06
 * Project javacircularsinglylinkedlist
 * Package com.github.ipan7
 */
public class Node {
    private int data;
    private Node link;


    public Node(int data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Node() {
        data = 0;
        link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}

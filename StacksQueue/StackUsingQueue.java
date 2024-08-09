package StacksQueue;

import java.util.*;

public class StackUsingQueue {

    static Queue<Integer> q1 = new LinkedList<Integer>();

    static boolean add(int value) {

        q1.add(value);
        for (int i = 1; i < q1.size(); i++) {
            q1.add(q1.remove());
        }
        return true;

    }

    static int remove() {
        int removed = q1.remove();
        return removed;

    }

    static void print() {
        for (int index = 0; index < q1.size(); index++) {
            System.out.println(q1.element());
        }
    }

    public static void main(String[] args) {
        add(12);
        add(23);
        add(45);
        System.out.println(remove());
        System.out.println(remove());

    }

}

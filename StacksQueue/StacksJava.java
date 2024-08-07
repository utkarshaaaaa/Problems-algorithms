package StacksQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//stack is a class
//queue is an interface in java
import String.strings;

class customQueues {
    protected int[] data;
    int end = -1;

    public customQueues(int size) {
        this.data = new int[size];

    }

    public boolean insert(int item) {

        data[end++] = item;
        return true;

    }

    public int remove() {
        int remove = data[0];
        // shifting
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];

        }
        end--;

        return remove;

    }

}

class customStack {
    protected int[] data;
    int pindx = -1;

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        pindx++;
        if (pindx == data.length - 1) {
            System.out.println("stack is full!!s");
            return false;
        }
        data[pindx] = item;
        return true;

    }

    public int pop() {
        int removed = data[pindx];
        pindx--;

        return removed;

    }

    public int peek() {
        return data[pindx];
    }

}

public class StacksJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();// stack is a class
        stack.push(12);
        stack.push(5512);

        Queue<Integer> queue = new LinkedList<>();// queue is an interface

        queue.add(12);
        queue.add(11);
        queue.add(33);
        System.out.println(queue);
        System.out.println(queue.peek());

        customStack sta = new customStack(10);
        sta.push(23);
        sta.push(45);
        sta.push(22);
        System.out.println(sta.pop());
    }

}

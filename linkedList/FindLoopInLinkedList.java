package linkedList;

import java.util.HashSet;

public class FindLoopInLinkedList {

    static public class LL {

        public Node head;

        public void insert(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            System.out.print(node.value + "=>");

        }

        public boolean checkLoop(Node node) {
            HashSet<Node> h = new HashSet<>();

            while (node != null) {
                if (h.contains(node)) {
                    return true;

                }
                h.add(node);

                node = node.next;
            }
            return false;

        }

        public class Node {

            Node next;
            int value;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }

        }
    }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(20);
        ll.insert(90);
        ll.insert(26);
        ll.insert(20);
        ll.head.next.next = ll.head;

        if (ll.checkLoop(ll.head)) {
            System.out.println("loop is there");

        } else {
            System.out.println("no loop");
        }

    }

}


package linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

//starting nod eis called head and end node is called tail
//every node contains some value of any type(int,string etc) and it points the other node connected to it
//class Node{
//     int val;//value of node
//     Node next; //next node connected to it
//}
//end point to the  null node (tail.next==null;)

public class SingleLinkedList {


    static public class LL{

        private Node head;
        private Node tail;
        private int size;

        public LL(){
            this.size=0;
        }

        public void insterAtFirst(int value){
            Node node=new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size+=1;

        }

        public void display(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.value +"=>");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public void insertAtEnd(int val){
            Node node=new Node(val);

            if(tail==null){
                insterAtFirst(val);
                return;
            }
            tail.next=node;
            node=tail;
            size+=1;
            System.out.println(node.value);
        }

        private class Node {
            private int value;
            private Node next;

            public Node(int value,Node next){
                this.value=value;
                this.next=next;

            }
            public Node(int value){
                this.value=value;
            }
        
            
        }


        
        
    }
    public static void main(String[] args) {

        // LinkedList<Integer> list=new LinkedList<>();
        // list.add(20);

        LL list= new LL();

        list.insterAtFirst(23);
        list.insterAtFirst(90);
        list.insterAtFirst(54);
        list.insertAtEnd(40);
        list.display();
       
    


       
       
        
        
        
    }

  

    
}

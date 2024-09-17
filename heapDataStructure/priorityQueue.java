package heapDataStructure;
//a data structure where data are retrived based upon priority . heapes are used to implement Priority queues
//two type of Pq:-min pq(min heap)increasing order, and max pq(max heap) decreasing order

import java.util.Collections;
import java.util.PriorityQueue;
class student implements Comparable<student>{
    int totalMarks;
    String name;

    student(int totalMarks,String name){
        this.name=name;
        this.totalMarks=totalMarks;

    }
    public String toString(){
        return "Student name: "+ this.name +" "+"Student Marks: "+ this.totalMarks;
    }
    public int compareTo(student that) {
        // return this.totalMarks-that.totalMarks;//inc order
        return that.totalMarks-this.totalMarks;//desc order

    };
}
public class priorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> minpq = new PriorityQueue<>();//default minpq is min
        // minpq.offer(9);
        // minpq.offer(28);
        // minpq.offer(8);
        // minpq.offer(2);
        // System.out.println("Maximumpriority in a min pq:" + minpq.peek());
        // PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());//max pq
        // maxpq.offer(9);
        // maxpq.offer(28);
        // maxpq.offer(8);
        // maxpq.offer(2);
        // System.out.println("Maximum priority im an max pq:" + maxpq.peek());
        // System.out.println("delete the max priority element: "+ maxpq.poll());
        // System.out.println("Maximum priority in a max pq:" + maxpq.peek());
        // System.out.println(maxpq.contains(8));

        PriorityQueue<student> minStudentsPq= new PriorityQueue<>();//minimum priority
        minStudentsPq.offer(new student(40, "ram"));
        minStudentsPq.offer(new student(90, "bharat"));
        minStudentsPq.offer(new student(87, "sam"));
        System.out.println(minStudentsPq.peek());

    }
    
}

package trees;
//delete ,add  and searh in o(logN)
//cost efficient
//o 1 or 2 childern only
//unbalance bt has o(n)(limitation of bt)
//inefficient for sorted data
//applications-networking ,file system,databases,solving maths ,machine learning (decision trees),compression of files,it is directed acyclic graph
//node of bt has Node left ,Node right,int value
//height is the number of edges from a perticular node to the leaf node
//level is the subtraction of height of root and height of node ,so root level  =0 ,level start with 0
//leaf node are the bottom most nodes 

import java.util.Scanner;

//types of binary tree-
//1-complete binary tree-all level full ,last full from left to right
//2-strict binary tree/full binary tree - each node has either 0 or 2 childern      use case-compression
//3-perfect binary tree- All level are full
//4-height balance -avg height o(logn)
//5-skewed bt-every node has only one child    max height=o(n)
//6-ordered bt-every node has some property   example-bst(left smaller and right bigger)

//properties to solve some problems:- 
//1-in perfect bt, height =h total nodes =2^(h+1)-1 it has the maximum numeber of nodes
//level=l number of nodes=2^l
//2-leaf node in perfect bt =2^height
//3-numebr of internal nodes apart from the leaf nodes-2^h -1
//leaves=n total  level =log(n+1) levels atleast
//n nodes ,log(n+1) minimum levels
//for strict binary tree,total leaves nodes=n ,internal nodes apart from leaves nodes=n-1
//number of leaf nodes=number of internal node +1    in strict bt
//5-number of leaf node =1 + number of internal node with 2 childern(apart form the root node)

//implementation:-
//1-linked repesentatio
//2-sequential repesentation ,using array used in implementation of heap

//height difference of the balanced tree should be less than equal to 1
//depth of a node= |height of lefdft node- height of rigfht node| it should be less than equal to 1 to be a balanced tree




public class BinaryTree {
   
    private static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value=value;
        }

    
        
    }
    private Node root;

    public void insert(Scanner scanner){
        System.out.println("enter the root node");
        int val=scanner.nextInt();
        root =new Node(val);

        inserting(scanner,root);

    }

    public void inserting(Scanner scanner,Node node){
        System.out.println("Do u want to enter on the left node of "+ node.value);
        boolean left=scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value on the left of "+ node.value);
            int leftVal=scanner.nextInt();
            node.left=new Node(leftVal);
            inserting(scanner, node.left);
        }
        System.out.println("Do u want to enter on the right node of "+ node.value);
        boolean right=scanner.nextBoolean();

        if(right){
            System.out.println("Enter the value on the right of "+ node.value);
            int rightVal=scanner.nextInt();
            node.right=new Node(rightVal);
            inserting(scanner, node.right);
            
        }


    }
    public void display(){
        
        display(root,"");

    }

    private void display(Node node,String Indent){
        if(node==null){
            return;
        }
        
        System.out.println(Indent+node.value);
        display(node.left,Indent+"\t");
        display(node.right,Indent + "\t");



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.insert(sc);
        tree.display();
        
    }
}





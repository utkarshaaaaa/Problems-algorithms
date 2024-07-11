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




public class Bst {
    public static void main(String[] args) {
        
    }
    
}

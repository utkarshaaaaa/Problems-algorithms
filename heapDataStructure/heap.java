package heapDataStructure;
//heapes are complete Binart tree
//Min heap :- value of root node nodes is less than or equal to its child nodes
//Hax heap :- value of root node nodes is greater than or equal to its child nodes
//Time complexity- log2(N) for searching o(n)
//we can move from child to parent and from parent to child 
//heapify:-the process of rearranging the heap by recursively comparing aparent node with the child node
//heapify is a angorithm which converts any array into heap 
public class heap {
    int heap[];
    int heapSize;
    int capacity;
    heap(int arr[]){
        heap=arr;
        heapSize=arr.length;
        capacity=arr.length;

    }
    static void swap(int i,int j,int[] arr){
        int k=i;
        i=j;
        j=k;

    }
    static void buildHeap(int n,int[] tree){
        
        for( int i=n/2-1;i>=0;i--){
            heapify(i, tree);
        }
        

    }
    static void heapify(int indx, int[] tree){
        int largest=indx;
        int leftNode=2*indx +1;
        int rightNode=2*indx+2;
        if(indx>0 && tree[leftNode] > tree[largest]){
            largest=leftNode;
        }
        if(indx>0 && tree[rightNode] > tree[largest]){
            largest=rightNode;
        }
        if(indx!=largest){
            swap(indx, rightNode, tree);
        }
        
        
    }
    public static void main(String[] args) {
        
    }
    
}

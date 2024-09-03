package recursion;

public class backTracking {
    static int numberOfPath(int row,int column){
        if(row ==1|| column==1){
            return 1;

        }
        int right=numberOfPath(row-1, column);
        int dowm=numberOfPath(row, column-1);
       
        return right + dowm;
    }
    public static void main(String[] args) {
        System.out.println(numberOfPath(3, 3));
        
    }
    
}

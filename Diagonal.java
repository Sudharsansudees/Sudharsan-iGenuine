public class Diagonal {
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}};

        int m=arr.length-1;
        int n=arr[0].length-1;

        System.out.println(arr[0][0]);
            int row=0;
            int col=0;
            
        for(int i=0;i<m;i++){
            
            System.out.println(arr[row][col++]);
            row++;
            col--;
            
            
            
        }
    }
}

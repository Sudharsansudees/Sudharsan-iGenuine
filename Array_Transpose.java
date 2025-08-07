public class Array_Transpose {
    public static void main(String[] args) {
        int arr[][]={
        {1,6,7},
        {9,18,15},
        {21,8,14}};

        //int index=0;
        int m=arr.length;
        int n=arr[0].length;
        int temp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=arr[j][i];
                
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}

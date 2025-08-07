public class replace1 {
    public static void main(String[] args) {
        int arr[][]={
        {1,1,1},
        {1,0,1},
        {1,1,1}};

        int rowlen=arr.length-1;
        int colen=arr[0].length-1;

        int r=0;
        int c=0;

        for(int i=0;i<=rowlen;i++){
            for(int j=0;j<colen;j++){
                if(arr[i][j]==0){
                    arr[i][j]=arr[r--][c];
                    arr[r--][c]=0;
                }
            }
        }
    }
}

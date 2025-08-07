import java.util.*;


public class problem6 {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};

        int r=2;
        int c=3;

        if(arr.length!=r*c){
            System.out.println("Invalid");
        }

        int matrix[][]=new int[r][c];
      
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    matrix[i][j]=arr[index++];
                    
               }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}

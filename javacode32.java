import java.util.*;

public class javacode32{
    public static void main(String args[]){
      int matrix[][]=new int[3][];

      matrix[0] = new int[4];
      matrix[1] = new int[2];
      matrix[2] = new int[3];
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the Element into 2D Matrix : ");
      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            matrix[i][j]=sc.nextInt();
        }
      }  

        // System.out.print(matrix.length);
    // matrix[1][2]=99;
    System.out.println("Elements are : ");
      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }  
     }
}